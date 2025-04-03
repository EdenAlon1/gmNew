package defpackage;

import io.grpc.Status;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import org.chromium.net.BidirectionalStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fehy implements feih {
    final /* synthetic */ feia a;

    public fehy(feia feiaVar) {
        this.a = feiaVar;
    }

    @Override // defpackage.feih
    public final void a(Status status) {
        int i = fehz.i;
        synchronized (this.a.o.a) {
            fehz fehzVar = this.a.o;
            if (fehzVar.d) {
                return;
            }
            fehzVar.d = true;
            fehzVar.e = status;
            Iterator it = fehzVar.b.iterator();
            while (it.hasNext()) {
                ((fehx) it.next()).a.clear();
            }
            fehzVar.b.clear();
            feia feiaVar = this.a;
            BidirectionalStream bidirectionalStream = feiaVar.k;
            if (bidirectionalStream != null) {
                bidirectionalStream.cancel();
            } else {
                feiaVar.i.a(feiaVar, status);
            }
        }
    }

    @Override // defpackage.feih
    public final void b(fevx fevxVar, boolean z, boolean z2, int i) {
        ByteBuffer byteBuffer;
        int i2 = fehz.i;
        synchronized (this.a.o.a) {
            if (this.a.o.d) {
                return;
            }
            if (fevxVar != null) {
                byteBuffer = ((feie) fevxVar).a;
                byteBuffer.flip();
            } else {
                byteBuffer = feia.a;
            }
            this.a.w(byteBuffer.remaining());
            feia feiaVar = this.a;
            fehz fehzVar = feiaVar.o;
            if (fehzVar.c) {
                feiaVar.t(byteBuffer, z, z2);
            } else {
                fehzVar.b.add(new fehx(byteBuffer, z, z2));
            }
        }
    }

    @Override // defpackage.feih
    public final void c(febo feboVar) {
        this.a.j.run();
        feia feiaVar = this.a;
        feht fehtVar = feiaVar.p;
        if (fehtVar == null) {
            return;
        }
        fehw fehwVar = new fehw(feiaVar);
        String str = feiaVar.d;
        fehu fehuVar = (fehu) fehtVar;
        boolean z = fehuVar.b;
        BidirectionalStream.Builder newBidirectionalStreamBuilder = fehuVar.a.newBidirectionalStreamBuilder(str, fehwVar, feiaVar.g);
        if (z) {
            newBidirectionalStreamBuilder.setTrafficStatsTag(fehuVar.c);
        }
        if (fehuVar.d) {
            newBidirectionalStreamBuilder.setTrafficStatsUid(fehuVar.e);
        }
        if (this.a.l) {
            newBidirectionalStreamBuilder.delayRequestHeadersUntilFirstFlush(true);
        }
        feia feiaVar2 = this.a;
        Object obj = feiaVar2.m;
        if (obj != null || feiaVar2.n != null) {
            if (obj != null) {
                newBidirectionalStreamBuilder.addRequestAnnotation(obj);
            }
            Collection collection = this.a.n;
            if (collection != null) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    newBidirectionalStreamBuilder.addRequestAnnotation(it.next());
                }
            }
        }
        feia feiaVar3 = this.a;
        newBidirectionalStreamBuilder.addHeader(fend.j.a, feiaVar3.e);
        newBidirectionalStreamBuilder.addHeader(fend.h.a, "application/grpc");
        newBidirectionalStreamBuilder.addHeader("te", "trailers");
        byte[][] a = fevt.a(feiaVar3.h);
        for (int i = 0; i < a.length; i += 2) {
            String str2 = new String(a[i], StandardCharsets.UTF_8);
            if (!fend.h.a.equalsIgnoreCase(str2) && !fend.j.a.equalsIgnoreCase(str2) && !fend.i.a.equalsIgnoreCase(str2)) {
                newBidirectionalStreamBuilder.addHeader(str2, new String(a[i + 1], StandardCharsets.UTF_8));
            }
        }
        this.a.k = newBidirectionalStreamBuilder.build();
        this.a.k.start();
    }
}
