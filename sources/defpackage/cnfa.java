package defpackage;

import android.content.Intent;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnfa {
    public static final cskc a = cskc.g("Bugle", "BootAndPackageReplacedReceiver");
    public static final entd b = entd.c("BugleNotifications");
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final Optional k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    public final ffbr q;
    public final ffbr r;
    public final ffbr s;
    public final ffbr t;

    public cnfa(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, Optional optional, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17) {
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.g = ffbrVar5;
        this.h = ffbrVar6;
        this.i = ffbrVar7;
        this.j = ffbrVar8;
        this.k = optional;
        this.l = ffbrVar9;
        this.m = ffbrVar10;
        this.n = ffbrVar11;
        this.o = ffbrVar12;
        this.p = ffbrVar13;
        this.q = ffbrVar14;
        this.r = ffbrVar15;
        this.s = ffbrVar16;
        this.t = ffbrVar17;
    }

    public static boolean a(Intent intent) {
        return "android.intent.action.BOOT_COMPLETED".equals(intent.getAction());
    }
}
