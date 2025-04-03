package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtuf implements dtux {
    public final dtue a;
    public final boolean b;
    private final String c;
    private final List d;

    public dtuf(int[] iArr, String str, dtue dtueVar) {
        this(iArr, false, str, dtueVar);
    }

    @Override // defpackage.dtux
    public final int a() {
        return ((Integer) this.d.get(0)).intValue();
    }

    @Override // defpackage.dtux
    public final int b() {
        return 2;
    }

    @Override // defpackage.dtux
    public final dtuw c(final dtve dtveVar) {
        final int intValue = ((Integer) this.d.remove(0)).intValue();
        return new dtud(this, new Runnable() { // from class: dtuc
            @Override // java.lang.Runnable
            public final void run() {
                dtuf.this.a.a(intValue, dtveVar);
            }
        });
    }

    @Override // defpackage.dtux
    public final String d() {
        return this.c;
    }

    @Override // defpackage.dtux
    public final boolean e() {
        return !this.d.isEmpty();
    }

    @Override // defpackage.dtux
    public final boolean f() {
        return false;
    }

    public dtuf(int[] iArr, boolean z, String str, dtue dtueVar) {
        this.d = new ArrayList();
        this.c = str;
        this.b = z;
        for (int i : iArr) {
            this.d.add(Integer.valueOf(i));
        }
        this.a = dtueVar;
    }
}
