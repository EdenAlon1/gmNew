package defpackage;

import android.media.MediaFormat;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mgj implements mzv, nau, mic {
    private mzv a;
    private nau b;
    private mzv c;
    private nau d;

    @Override // defpackage.nau
    public final void a(long j, float[] fArr) {
        nau nauVar = this.d;
        if (nauVar != null) {
            nauVar.a(j, fArr);
        }
        nau nauVar2 = this.b;
        if (nauVar2 != null) {
            nauVar2.a(j, fArr);
        }
    }

    @Override // defpackage.nau
    public final void b() {
        nau nauVar = this.d;
        if (nauVar != null) {
            nauVar.b();
        }
        nau nauVar2 = this.b;
        if (nauVar2 != null) {
            nauVar2.b();
        }
    }

    @Override // defpackage.mzv
    public final void c(long j, long j2, lqc lqcVar, MediaFormat mediaFormat) {
        long j3;
        long j4;
        lqc lqcVar2;
        MediaFormat mediaFormat2;
        mzv mzvVar = this.c;
        if (mzvVar != null) {
            mzvVar.c(j, j2, lqcVar, mediaFormat);
            mediaFormat2 = mediaFormat;
            lqcVar2 = lqcVar;
            j4 = j2;
            j3 = j;
        } else {
            j3 = j;
            j4 = j2;
            lqcVar2 = lqcVar;
            mediaFormat2 = mediaFormat;
        }
        mzv mzvVar2 = this.a;
        if (mzvVar2 != null) {
            mzvVar2.c(j3, j4, lqcVar2, mediaFormat2);
        }
    }

    @Override // defpackage.mic
    public final void r(int i, Object obj) {
        if (i == 7) {
            this.a = (mzv) obj;
            return;
        }
        if (i == 8) {
            this.b = (nau) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        nbk nbkVar = (nbk) obj;
        if (nbkVar == null) {
            this.c = null;
            this.d = null;
        } else {
            nbg nbgVar = nbkVar.c;
            this.c = nbgVar;
            this.d = nbgVar;
        }
    }
}
