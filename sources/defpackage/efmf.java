package defpackage;

import android.accounts.Account;
import android.app.Activity;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efmf {
    public efmh a;
    public Integer b;
    public Account c;
    public List d;
    private final Activity e;
    private int f;
    private Integer g;
    private efmi h;
    private efmg i;
    private boolean j;
    private boolean k;
    private final efnl l;

    public efmf(Activity activity, efnl efnlVar) {
        if (activity == null) {
            throw new IllegalArgumentException("Client activity is not set.");
        }
        this.e = activity;
        this.l = efnlVar;
        this.h = efmi.FIRST_CARD_NON_MODAL;
        this.i = efmg.CARD;
        this.j = true;
        this.k = true;
    }

    public final efmj a() {
        return new efmj(this.e, this.f, this.g, this.a, this.b, this.c, this.l, this.d, this.h, this.i, this.j, this.k);
    }

    public final void b(int i, Integer num) {
        if (num.intValue() <= 0) {
            throw new IllegalArgumentException("The max prompt width must be a positive value.");
        }
        this.f = i;
        this.g = num;
    }
}
