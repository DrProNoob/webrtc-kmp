package com.shepeliev.webrtckmm

expect class IceCandidate(
    sdpMid: String,
    sdpMLineIndex: Int,
    sdp: String,
) {
    val sdpMid: String
    val sdpMLineIndex: Int
    val sdp: String
    val serverUrl: String
    val adapterType: AdapterType
}
