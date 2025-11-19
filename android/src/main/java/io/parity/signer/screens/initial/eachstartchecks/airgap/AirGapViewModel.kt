package io.parity.signer.screens.initial.eachstartchecks.airgap

import android.content.Context
import android.provider.Settings
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.parity.signer.dependencygraph.ServiceLocator
import io.parity.signer.domain.FeatureFlags
import io.parity.signer.domain.FeatureOption
import io.parity.signer.domain.NetworkExposedStateKeeper
import io.parity.signer.domain.NetworkState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch


class AirGapViewModel : ViewModel() {

	private val _state = MutableStateFlow<AirGapScreenState>(
		AirGapScreenState(
			airplaneModeEnabled = true,
			wifiDisabled = true,
			bluetoothDisabled = true,
			isAdbDisabled = true,
			isUsbDisconnected = true,
		)
	)
	val state: StateFlow<AirGapScreenState> = _state.asStateFlow()

	fun init() {}

	fun unInit() {}

	fun onConfirmedAirgap() {}
}
