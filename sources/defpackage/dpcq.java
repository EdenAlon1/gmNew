package defpackage;

import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpcq extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ dpcr e;
    final /* synthetic */ Uri f;
    final /* synthetic */ eepm g;
    final /* synthetic */ Duration h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpcq(dpcr dpcrVar, Uri uri, eepm eepmVar, Duration duration, ffgu ffguVar) {
        super(2, ffguVar);
        this.e = dpcrVar;
        this.f = uri;
        this.g = eepmVar;
        this.h = duration;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpcq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fc, code lost:
    
        if (r4.c(r13) == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0086, code lost:
    
        if (r1.b(r13) != r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpcq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpcq(this.e, this.f, this.g, this.h, ffguVar);
    }
}
