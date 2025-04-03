package defpackage;

import java.util.List;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drja {
    public final List a;
    public final List b;
    public final drht c;
    public final ffix d;
    public final ffix e;
    public final ffix f;
    public final ffix g;
    public final ffix h;
    public final ffix i;
    public final ffix j;
    public final boolean k;
    public final fgdj l;
    public final Future m;
    public final int n;
    public final List o;
    public final int p;

    public drja() {
        this(null);
    }

    public static /* synthetic */ drja a(drja drjaVar, List list, int i, List list2, drht drhtVar, ffix ffixVar, ffix ffixVar2, ffix ffixVar3, ffix ffixVar4, ffix ffixVar5, ffix ffixVar6, ffix ffixVar7, boolean z, fgdj fgdjVar, Future future, int i2, List list3, int i3) {
        List list4 = (i3 & 1) != 0 ? drjaVar.a : list;
        int i4 = (i3 & 2) != 0 ? drjaVar.p : i;
        List list5 = (i3 & 4) != 0 ? drjaVar.b : list2;
        drht drhtVar2 = (i3 & 8) != 0 ? drjaVar.c : drhtVar;
        ffix ffixVar8 = (i3 & 16) != 0 ? drjaVar.d : ffixVar;
        ffix ffixVar9 = (i3 & 32) != 0 ? drjaVar.e : ffixVar2;
        ffix ffixVar10 = (i3 & 64) != 0 ? drjaVar.f : ffixVar3;
        ffix ffixVar11 = (i3 & 128) != 0 ? drjaVar.g : ffixVar4;
        ffix ffixVar12 = (i3 & 256) != 0 ? drjaVar.h : ffixVar5;
        ffix ffixVar13 = (i3 & 512) != 0 ? drjaVar.i : ffixVar6;
        ffix ffixVar14 = (i3 & 1024) != 0 ? drjaVar.j : ffixVar7;
        boolean z2 = (i3 & 2048) != 0 ? drjaVar.k : z;
        fgdj fgdjVar2 = (i3 & 4096) != 0 ? drjaVar.l : fgdjVar;
        Future future2 = (i3 & 8192) != 0 ? drjaVar.m : future;
        List list6 = list4;
        int i5 = (i3 & 16384) != 0 ? drjaVar.n : i2;
        List list7 = (i3 & 32768) != 0 ? drjaVar.o : list3;
        list6.getClass();
        if (i4 == 0) {
            throw null;
        }
        list5.getClass();
        ffixVar8.getClass();
        ffixVar9.getClass();
        ffixVar10.getClass();
        ffixVar11.getClass();
        ffixVar12.getClass();
        ffixVar13.getClass();
        ffixVar14.getClass();
        fgdjVar2.getClass();
        list7.getClass();
        return new drja(list6, i4, list5, drhtVar2, ffixVar8, ffixVar9, ffixVar10, ffixVar11, ffixVar12, ffixVar13, ffixVar14, z2, fgdjVar2, future2, i5, list7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drja)) {
            return false;
        }
        drja drjaVar = (drja) obj;
        return ffkj.e(this.a, drjaVar.a) && this.p == drjaVar.p && ffkj.e(this.b, drjaVar.b) && ffkj.e(this.c, drjaVar.c) && ffkj.e(this.d, drjaVar.d) && ffkj.e(this.e, drjaVar.e) && ffkj.e(this.f, drjaVar.f) && ffkj.e(this.g, drjaVar.g) && ffkj.e(this.h, drjaVar.h) && ffkj.e(this.i, drjaVar.i) && ffkj.e(this.j, drjaVar.j) && this.k == drjaVar.k && ffkj.e(this.l, drjaVar.l) && ffkj.e(this.m, drjaVar.m) && this.n == drjaVar.n && ffkj.e(this.o, drjaVar.o);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.p) * 31) + this.b.hashCode();
        drht drhtVar = this.c;
        int hashCode2 = ((((((((((((((((((((hashCode * 31) + (drhtVar == null ? 0 : drhtVar.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + (true != this.k ? 1237 : 1231)) * 31) + this.l.hashCode()) * 31;
        Future future = this.m;
        return ((((hashCode2 + (future != null ? future.hashCode() : 0)) * 31) + this.n) * 31) + this.o.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MagicComposeUiState(smarterReplies=");
        sb.append(this.a);
        sb.append(", magicComposeMode=");
        sb.append((Object) (this.p != 1 ? "MAGIC_REWRITE" : "SUGGESTED_TEXT"));
        sb.append(", rewriteToneUiData=");
        sb.append(this.b);
        sb.append(", errorUiData=");
        sb.append(this.c);
        sb.append(", onRetry=");
        sb.append(this.d);
        sb.append(", onDismiss=");
        sb.append(this.e);
        sb.append(", onScreenClose=");
        sb.append(this.f);
        sb.append(", onScreenStop=");
        sb.append(this.g);
        sb.append(", thumbsUpButtonOnClickListener=");
        sb.append(this.h);
        sb.append(", thumbsDownButtonOnClickListener=");
        sb.append(this.i);
        sb.append(", infoButtonOnClickListener=");
        sb.append(this.j);
        sb.append(", feedbackAndInfoButtonsEnabled=");
        sb.append(this.k);
        sb.append(", onboardedState=");
        sb.append(this.l);
        sb.append(", suggestionsFuture=");
        sb.append(this.m);
        sb.append(", initialSelectedTabIndex=");
        sb.append(this.n);
        sb.append(", styles=");
        sb.append(this.o);
        sb.append(")");
        return sb.toString();
    }

    public drja(List list, int i, List list2, drht drhtVar, ffix ffixVar, ffix ffixVar2, ffix ffixVar3, ffix ffixVar4, ffix ffixVar5, ffix ffixVar6, ffix ffixVar7, boolean z, fgdj fgdjVar, Future future, int i2, List list3) {
        this.a = list;
        this.p = i;
        this.b = list2;
        this.c = drhtVar;
        this.d = ffixVar;
        this.e = ffixVar2;
        this.f = ffixVar3;
        this.g = ffixVar4;
        this.h = ffixVar5;
        this.i = ffixVar6;
        this.j = ffixVar7;
        this.k = z;
        this.l = fgdjVar;
        this.m = future;
        this.n = i2;
        this.o = list3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ drja(byte[] r18) {
        /*
            r17 = this;
            ffel r1 = defpackage.ffel.a
            drit r5 = new drit
            r5.<init>()
            driu r6 = new driu
            r6.<init>()
            driv r7 = new driv
            r7.<init>()
            driw r8 = new driw
            r8.<init>()
            drix r9 = new drix
            r9.<init>()
            driy r10 = new driy
            r10.<init>()
            driz r11 = new driz
            r11.<init>()
            drhu r0 = defpackage.drhu.a
            fgcm r13 = defpackage.fgdm.a(r0)
            r15 = -1
            ffel r16 = defpackage.ffel.a
            r2 = 1
            r4 = 0
            r12 = 0
            r14 = 0
            r3 = r1
            r0 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drja.<init>(byte[]):void");
    }
}
