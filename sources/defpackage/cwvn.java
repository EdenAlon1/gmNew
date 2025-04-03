package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwvn extends cwuk {
    private final cpbs a;
    private final cwzu b;
    private final cxao c;
    private cxan d;

    /* compiled from: PG */
    final class a implements ellf {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }
    }

    public cwvn(cpbs cpbsVar, Context context, cxao cxaoVar, cwzu cwzuVar, int i) {
        super(context);
        this.c = cxaoVar;
        this.b = cwzuVar;
        this.m = i;
        this.a = cpbsVar;
    }

    @Override // defpackage.cwuk
    protected final void a(int i) {
        this.n.getClass();
        ellj.f(new a(i == 1), this.b.ap);
        d();
    }

    @Override // defpackage.cwuk
    protected final void c() {
        if (this.d == null) {
            this.d = this.c.a(this.m);
        }
        cwzz a2 = this.d.a();
        boolean booleanValue = ((Boolean) ((a2.b & 64) != 0 ? Optional.of(Boolean.valueOf(a2.i)) : Optional.empty()).orElse(Boolean.valueOf(this.a.a(this.m).n()))).booleanValue();
        CharSequence[] charSequenceArr = {this.i.getString(R.string.disable_group_mms), this.i.getString(R.string.enable_group_mms)};
        this.j = this.i.getString(R.string.group_mms_pref_title);
        this.k = charSequenceArr;
        this.l = booleanValue ? 1 : 0;
        this.m = this.m;
        super.c();
    }
}
