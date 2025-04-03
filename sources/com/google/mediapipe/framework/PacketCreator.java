package com.google.mediapipe.framework;

import com.google.mediapipe.framework.ProtoUtil;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class PacketCreator {
    public final Graph a;

    public PacketCreator(Graph graph) {
        this.a = graph;
    }

    private void releaseWithSyncToken(long j, TextureReleaseCallback textureReleaseCallback) {
        textureReleaseCallback.release(new GraphGlSyncToken(j));
    }

    public native long nativeCreateAudioPacket(long j, byte[] bArr, int i, int i2, int i3);

    public native long nativeCreateAudioPacketDirect(long j, ByteBuffer byteBuffer, int i, int i2);

    public native long nativeCreateCpuImage(long j, ByteBuffer byteBuffer, int i, int i2, int i3, int i4);

    public native long nativeCreateGpuBuffer(long j, int i, int i2, int i3, TextureReleaseCallback textureReleaseCallback);

    public native long nativeCreateInt32Pair(long j, int i, int i2);

    public native long nativeCreateProto(long j, ProtoUtil.SerializedMessage serializedMessage);

    public native long nativeCreateString(long j, String str);
}
