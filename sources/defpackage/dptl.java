package defpackage;

import j$.time.Duration;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dptl {
    public final int a;
    public final atl b;
    public final int c;
    public final Duration d;
    public final Duration e;
    public final boolean f;
    public final List g;
    public final ffji h;
    public final ffix i;
    public final ffjm j;
    public final ffix k;
    public final ffjn l;
    public final List m;
    public final ffix n;
    public final dpxa o;
    public final dpvl p;
    public final boolean q;
    public final boolean r;
    public final int s;
    private final ffji t;

    public dptl() {
        this(null, null, null, null, null, null, null, null, 0, null, 1048575);
    }

    public static /* synthetic */ dptl a(dptl dptlVar, int i, atl atlVar, int i2, Duration duration, boolean z, List list, List list2, dpxa dpxaVar, int i3) {
        int i4 = (i3 & 1) != 0 ? dptlVar.a : i;
        atl atlVar2 = (i3 & 2) != 0 ? dptlVar.b : atlVar;
        int i5 = (i3 & 4) != 0 ? dptlVar.c : i2;
        Duration duration2 = (i3 & 8) != 0 ? dptlVar.d : duration;
        Duration duration3 = (i3 & 16) != 0 ? dptlVar.e : null;
        boolean z2 = (i3 & 32) != 0 ? dptlVar.f : z;
        List list3 = (i3 & 64) != 0 ? dptlVar.g : list;
        ffji ffjiVar = (i3 & 128) != 0 ? dptlVar.h : null;
        ffix ffixVar = (i3 & 256) != 0 ? dptlVar.i : null;
        ffjm ffjmVar = (i3 & 512) != 0 ? dptlVar.j : null;
        ffix ffixVar2 = (i3 & 1024) != 0 ? dptlVar.k : null;
        ffjn ffjnVar = (i3 & 2048) != 0 ? dptlVar.l : null;
        List list4 = (i3 & 4096) != 0 ? dptlVar.m : list2;
        ffix ffixVar3 = (i3 & 8192) != 0 ? dptlVar.n : null;
        ffji ffjiVar2 = (i3 & 16384) != 0 ? dptlVar.t : null;
        dpxa dpxaVar2 = (i3 & 32768) != 0 ? dptlVar.o : dpxaVar;
        int i6 = dptlVar.s;
        dpvl dpvlVar = dptlVar.p;
        boolean z3 = dptlVar.q;
        boolean z4 = dptlVar.r;
        atlVar2.getClass();
        duration2.getClass();
        duration3.getClass();
        list3.getClass();
        ffjiVar.getClass();
        ffixVar.getClass();
        ffjmVar.getClass();
        ffixVar2.getClass();
        ffjnVar.getClass();
        list4.getClass();
        ffixVar3.getClass();
        ffjiVar2.getClass();
        dpxaVar2.getClass();
        return new dptl(i4, atlVar2, i5, duration2, duration3, z2, list3, ffjiVar, ffixVar, ffjmVar, ffixVar2, ffjnVar, list4, ffixVar3, ffjiVar2, dpxaVar2, i6, dpvlVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dptl)) {
            return false;
        }
        dptl dptlVar = (dptl) obj;
        if (this.a != dptlVar.a || !ffkj.e(this.b, dptlVar.b) || this.c != dptlVar.c || !ffkj.e(this.d, dptlVar.d) || !ffkj.e(this.e, dptlVar.e) || this.f != dptlVar.f || !ffkj.e(this.g, dptlVar.g) || !ffkj.e(this.h, dptlVar.h) || !ffkj.e(this.i, dptlVar.i) || !ffkj.e(this.j, dptlVar.j) || !ffkj.e(this.k, dptlVar.k) || !ffkj.e(this.l, dptlVar.l) || !ffkj.e(this.m, dptlVar.m) || !ffkj.e(this.n, dptlVar.n) || !ffkj.e(this.t, dptlVar.t) || this.o != dptlVar.o || this.s != dptlVar.s || !ffkj.e(this.p, dptlVar.p)) {
            return false;
        }
        boolean z = dptlVar.q;
        boolean z2 = dptlVar.r;
        return true;
    }

    public final int hashCode() {
        int hashCode = (((((((((((((((((((((((((((((this.a * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + dptd.a(this.f)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.t.hashCode()) * 31) + this.o.hashCode();
        dpvl dpvlVar = this.p;
        return (((((((hashCode * 31) + this.s) * 31) + (dpvlVar == null ? 0 : dpvlVar.hashCode())) * 31) + dptd.a(false)) * 31) + dptd.a(true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraUiData(captureMode=");
        sb.append(this.a);
        sb.append(", selectedCamera=");
        sb.append(this.b);
        sb.append(", flashMode=");
        sb.append(this.c);
        sb.append(", recordingTimer=");
        sb.append(this.d);
        sb.append(", maxRecordingDuration=");
        sb.append(this.e);
        sb.append(", isRecording=");
        sb.append(this.f);
        sb.append(", zoomButtons=");
        sb.append(this.g);
        sb.append(", switchCamera=");
        sb.append(this.h);
        sb.append(", toggleFlash=");
        sb.append(this.i);
        sb.append(", selectMode=");
        sb.append(this.j);
        sb.append(", onCapture=");
        sb.append(this.k);
        sb.append(", bind=");
        sb.append(this.l);
        sb.append(", effects=");
        sb.append(this.m);
        sb.append(", onClose=");
        sb.append(this.n);
        sb.append(", selectZoom=");
        sb.append(this.t);
        sb.append(", orientation=");
        sb.append(this.o);
        sb.append(", galleryPickerConfiguration=");
        int i = this.s;
        sb.append((Object) (i != 1 ? i != 2 ? "WITHOUT_PERMISSION" : "WITH_PERMISSION" : "NONE"));
        sb.append(", shutterLongPressHandler=");
        sb.append(this.p);
        sb.append(", enableScreenFlash=false, useTopAppBarComponent=true)");
        return sb.toString();
    }

    public dptl(int i, atl atlVar, int i2, Duration duration, Duration duration2, boolean z, List list, ffji ffjiVar, ffix ffixVar, ffjm ffjmVar, ffix ffixVar2, ffjn ffjnVar, List list2, ffix ffixVar3, ffji ffjiVar2, dpxa dpxaVar, int i3, dpvl dpvlVar) {
        atlVar.getClass();
        duration.getClass();
        duration2.getClass();
        list.getClass();
        ffjiVar.getClass();
        ffixVar.getClass();
        ffjmVar.getClass();
        ffixVar2.getClass();
        ffjnVar.getClass();
        list2.getClass();
        ffixVar3.getClass();
        ffjiVar2.getClass();
        dpxaVar.getClass();
        if (i3 == 0) {
            throw null;
        }
        this.a = i;
        this.b = atlVar;
        this.c = i2;
        this.d = duration;
        this.e = duration2;
        this.f = z;
        this.g = list;
        this.h = ffjiVar;
        this.i = ffixVar;
        this.j = ffjmVar;
        this.k = ffixVar2;
        this.l = ffjnVar;
        this.m = list2;
        this.n = ffixVar3;
        this.t = ffjiVar2;
        this.o = dpxaVar;
        this.s = i3;
        this.p = dpvlVar;
        this.q = false;
        this.r = true;
    }

    public /* synthetic */ dptl(Duration duration, ffji ffjiVar, ffix ffixVar, ffjm ffjmVar, ffix ffixVar2, ffjn ffjnVar, ffix ffixVar3, ffji ffjiVar2, int i, dpvl dpvlVar, int i2) {
        this(i2 & 1, (i2 & 2) != 0 ? atl.b : null, (i2 & 4) != 0 ? 2 : 0, (i2 & 8) != 0 ? Duration.ZERO : null, (i2 & 16) != 0 ? Duration.ofSeconds(30L) : duration, false, (i2 & 64) != 0 ? ffel.a : null, (i2 & 128) != 0 ? new ffji() { // from class: dpte
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((lkr) obj).getClass();
                return ffcu.a;
            }
        } : ffjiVar, (i2 & 256) != 0 ? new ffix() { // from class: dptf
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : ffixVar, (i2 & 512) != 0 ? new ffjm() { // from class: dptg
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                ((Integer) obj2).intValue();
                ((lkr) obj).getClass();
                return ffcu.a;
            }
        } : ffjmVar, (i2 & 1024) != 0 ? new ffix() { // from class: dpth
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : ffixVar2, (i2 & 2048) != 0 ? new dptk(null) : ffjnVar, (i2 & 4096) != 0 ? ffel.a : null, (i2 & 8192) != 0 ? new ffix() { // from class: dpti
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : ffixVar3, (i2 & 16384) != 0 ? new ffji() { // from class: dptj
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((Float) obj).floatValue();
                return ffcu.a;
            }
        } : ffjiVar2, (32768 & i2) != 0 ? dpxa.a : null, (65536 & i2) != 0 ? 1 : i, (i2 & 131072) != 0 ? null : dpvlVar);
    }
}
