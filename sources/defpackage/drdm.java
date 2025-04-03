package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drdm extends drfe {
    public final Integer a;
    private final boolean b;
    private final boolean c;
    private final int d;
    private final boolean e;
    private final boolean f;

    public drdm() {
        this(false, 1023);
    }

    @Override // defpackage.drfe
    public final int a() {
        return this.d;
    }

    @Override // defpackage.drfe
    public final drje b() {
        return null;
    }

    @Override // defpackage.drfe
    public final boolean c() {
        return this.b;
    }

    @Override // defpackage.drfe
    public final boolean d() {
        return this.f;
    }

    @Override // defpackage.drfe
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.drfe
    public final boolean f() {
        return this.e;
    }

    @Override // defpackage.drfe
    public final boolean g() {
        return false;
    }

    public /* synthetic */ drdm(boolean z, int i) {
        Integer num = (i & 1) != 0 ? 3 : null;
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        int i2 = (i & 16) != 0 ? R.dimen.gifsticker_item_min_width : 0;
        boolean z4 = (i & 64) != 0;
        boolean z5 = (i & 512) == 0;
        this.a = num;
        this.b = z2;
        this.c = z3;
        this.d = i2;
        this.e = z4;
        this.f = z & z5;
    }

    @Override // defpackage.drfe
    public final void h() {
    }
}
