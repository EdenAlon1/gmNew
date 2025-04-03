package com.google.mediapipe.framework;

import com.google.mediapipe.framework.ProtoUtil;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PacketGetter {
    public static GraphTextureFrame a(Packet packet) {
        return new GraphTextureFrame(nativeGetGpuBuffer(packet.getNativeHandle(), true), packet.a());
    }

    public static native byte[] nativeGetAudioData(long j);

    public static native float[] nativeGetFloat32Vector(long j);

    private static native long nativeGetGpuBuffer(long j, boolean z);

    public static native int nativeGetImageHeight(long j);

    public static native int nativeGetImageHeightFromImageList(long j);

    public static native boolean nativeGetImageList(long j, ByteBuffer[] byteBufferArr, boolean z);

    public static native int nativeGetImageListSize(long j);

    public static native int nativeGetImageWidth(long j);

    public static native int nativeGetImageWidthFromImageList(long j);

    public static native int nativeGetMatrixRows(long j);

    public static native void nativeGetProto(long j, ProtoUtil.SerializedMessage serializedMessage);

    public static native boolean nativeGetRgbaFromRgb(long j, ByteBuffer byteBuffer);
}
