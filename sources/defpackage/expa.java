package defpackage;

import android.graphics.Bitmap;
import com.google.mediapipe.framework.MediaPipeException;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketGetter;
import j$.util.Optional;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class expa implements exnr {
    final /* synthetic */ int a;
    final /* synthetic */ expc b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    public expa(int i, expc expcVar, int i2, int i3) {
        this.a = i;
        this.b = expcVar;
        this.c = i2;
        this.d = i3;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.exnr
    public final /* synthetic */ exob a(List list) {
        Packet packet = (Packet) list.get(this.a);
        if (packet.nativeIsEmpty(packet.a)) {
            return expg.e(Optional.empty(), Optional.empty(), new ArrayList(), ((Packet) list.get(this.a)).a());
        }
        ((exov) this.b).b.isPresent();
        boolean z = ((exov) this.b).a;
        Optional empty = Optional.empty();
        if (z) {
            int nativeGetImageWidthFromImageList = PacketGetter.nativeGetImageWidthFromImageList(((Packet) list.get(this.c)).getNativeHandle());
            int nativeGetImageHeightFromImageList = PacketGetter.nativeGetImageHeightFromImageList(((Packet) list.get(this.c)).getNativeHandle());
            Optional of = Optional.of(new ArrayList());
            int nativeGetImageListSize = PacketGetter.nativeGetImageListSize(((Packet) list.get(this.c)).getNativeHandle());
            ByteBuffer[] byteBufferArr = new ByteBuffer[nativeGetImageListSize];
            for (int i = 0; i < nativeGetImageListSize; i++) {
                byteBufferArr[i] = ByteBuffer.allocateDirect(nativeGetImageWidthFromImageList * nativeGetImageHeightFromImageList * 4);
            }
            if (!PacketGetter.nativeGetImageList(((Packet) list.get(this.c)).getNativeHandle(), byteBufferArr, true)) {
                throw new MediaPipeException(exlp.INTERNAL.ordinal(), "There is an error getting confidence masks.");
            }
            for (int i2 = 0; i2 < nativeGetImageListSize; i2++) {
                of.get().add(new exma(new exlz(byteBufferArr[i2]), nativeGetImageWidthFromImageList, nativeGetImageHeightFromImageList));
            }
            empty = of;
        }
        int i3 = this.d;
        Optional empty2 = Optional.empty();
        float[] nativeGetFloat32Vector = PacketGetter.nativeGetFloat32Vector(((Packet) list.get(i3)).getNativeHandle());
        ArrayList arrayList = new ArrayList(nativeGetFloat32Vector.length);
        for (float f : nativeGetFloat32Vector) {
            arrayList.add(Float.valueOf(f));
        }
        int i4 = exoq.d;
        return expg.e(empty, empty2, arrayList, -1L);
    }

    @Override // defpackage.exnr
    public final /* bridge */ /* synthetic */ void b(List list) {
        Packet packet = (Packet) list.get(this.a);
        int nativeGetImageWidth = PacketGetter.nativeGetImageWidth(packet.getNativeHandle());
        int nativeGetImageHeight = PacketGetter.nativeGetImageHeight(packet.getNativeHandle());
        Bitmap createBitmap = Bitmap.createBitmap(nativeGetImageWidth, nativeGetImageHeight, Bitmap.Config.ARGB_8888);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(nativeGetImageWidth * nativeGetImageHeight * 4);
        PacketGetter.nativeGetRgbaFromRgb(packet.getNativeHandle(), allocateDirect);
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        exlv.a(createBitmap);
    }
}
