package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhis extends dfux implements dfvc {
    public dhis(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // defpackage.dfvc
    public final /* bridge */ /* synthetic */ Object d() {
        throw null;
    }

    public final String e() {
        return gN("gaia_id");
    }

    public final String f() {
        return gN("account_name");
    }

    public final String g() {
        return dhju.a.a(gN("avatar"));
    }

    public final String h() {
        return !TextUtils.isEmpty(gN("display_name")) ? gN("display_name") : f();
    }

    public final String i() {
        return k() ? gN("family_name") : "null";
    }

    public final String j() {
        return l() ? gN("given_name") : "null";
    }

    public final boolean k() {
        return !TextUtils.isEmpty(gN("family_name"));
    }

    public final boolean l() {
        return !TextUtils.isEmpty(gN("given_name"));
    }
}
