package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyd implements dnoq {
    public final zxl a;
    public final ffix b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final ffix g;
    public final zys h;
    public final boolean i;
    public final dowd j;
    public final List k;
    public final dnwi l;
    public final zyc m;
    private final ffix n;

    public zyd(zxl zxlVar, ffix ffixVar, String str, boolean z, boolean z2, boolean z3, ffix ffixVar2, ffix ffixVar3, zys zysVar, boolean z4, dowd dowdVar, List list, dnwi dnwiVar, zyc zycVar) {
        this.a = zxlVar;
        this.b = ffixVar;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.n = ffixVar2;
        this.g = ffixVar3;
        this.h = zysVar;
        this.i = z4;
        this.j = dowdVar;
        this.k = list;
        this.l = dnwiVar;
        this.m = zycVar;
    }

    public static /* synthetic */ zyd e(zyd zydVar, dowd dowdVar, int i) {
        zxl zxlVar = (i & 1) != 0 ? zydVar.a : null;
        ffix ffixVar = (i & 2) != 0 ? zydVar.b : null;
        String str = (i & 4) != 0 ? zydVar.c : null;
        boolean z = (i & 8) != 0 ? zydVar.d : false;
        boolean z2 = (i & 16) != 0 ? zydVar.e : false;
        boolean z3 = (i & 32) != 0 ? zydVar.f : false;
        ffix ffixVar2 = (i & 64) != 0 ? zydVar.n : null;
        ffix ffixVar3 = (i & 128) != 0 ? zydVar.g : null;
        zys zysVar = (i & 256) != 0 ? zydVar.h : null;
        boolean z4 = (i & 512) != 0 ? zydVar.i : false;
        dowd dowdVar2 = (i & 1024) != 0 ? zydVar.j : dowdVar;
        List list = zydVar.k;
        dnwi dnwiVar = zydVar.l;
        zyc zycVar = zydVar.m;
        zxlVar.getClass();
        ffixVar.getClass();
        str.getClass();
        ffixVar2.getClass();
        ffixVar3.getClass();
        return new zyd(zxlVar, ffixVar, str, z, z2, z3, ffixVar2, ffixVar3, zysVar, z4, dowdVar2, list, dnwiVar, zycVar);
    }

    @Override // defpackage.dnoq
    public final String a() {
        throw null;
    }

    @Override // defpackage.dnoq
    public final ffix b() {
        return this.n;
    }

    @Override // defpackage.dnoq
    public final ffix c() {
        throw null;
    }

    @Override // defpackage.dnoq
    public final boolean d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyd)) {
            return false;
        }
        zyd zydVar = (zyd) obj;
        return ffkj.e(this.a, zydVar.a) && ffkj.e(this.b, zydVar.b) && ffkj.e(this.c, zydVar.c) && this.d == zydVar.d && this.e == zydVar.e && this.f == zydVar.f && ffkj.e(this.n, zydVar.n) && ffkj.e(this.g, zydVar.g) && ffkj.e(this.h, zydVar.h) && this.i == zydVar.i && ffkj.e(this.j, zydVar.j) && ffkj.e(this.k, zydVar.k) && ffkj.e(this.l, zydVar.l) && ffkj.e(this.m, zydVar.m);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        ffix ffixVar = this.n;
        int a = (((((((((hashCode * 31) + zxz.a(this.d)) * 31) + zxz.a(this.e)) * 31) + zxz.a(this.f)) * 31) + ffixVar.hashCode()) * 31) + this.g.hashCode();
        zys zysVar = this.h;
        int hashCode2 = ((((a * 31) + (zysVar == null ? 0 : zysVar.hashCode())) * 31) + zxz.a(this.i)) * 31;
        dowd dowdVar = this.j;
        int hashCode3 = (hashCode2 + (dowdVar == null ? 0 : dowdVar.hashCode())) * 31;
        List list = this.k;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        dnwi dnwiVar = this.l;
        return ((hashCode4 + (dnwiVar != null ? dnwiVar.hashCode() : 0)) * 31) + this.m.hashCode();
    }

    public final String toString() {
        return "BugleAudioBubbleUiData(audioPlayer=" + this.a + ", onDispose=" + this.b + ", contentDescription=" + this.c + ", isHighlighted=" + this.d + ", isOutgoing=" + this.e + ", isTransferring=" + this.f + ", onClick=" + this.n + ", onLayout=" + this.g + ", transcript=" + this.h + ", isRichType=" + this.i + ", voiceMood=" + this.j + ", amplitudeList=" + this.k + ", statusUiData=" + this.l + ", flags=" + this.m + ")";
    }
}
