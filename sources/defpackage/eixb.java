package defpackage;

import android.os.Bundle;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eixb extends lml {
    public int a;
    public eixz b;
    public int c;
    public boolean d;
    public final boolean e;

    public eixb(llv llvVar) {
        llvVar.getClass();
        this.a = -1;
        eixz eixzVar = eixz.a;
        eixzVar.getClass();
        this.b = eixzVar;
        Bundle bundle = (Bundle) llvVar.b("tiktok_activity_account_state_saved_instance_state");
        if (bundle != null) {
            this.e = true;
            this.a = bundle.getInt("state_account_id", -1);
            try {
                this.b = (eixz) ProtoParsers.d(bundle, "state_account_info", eixz.a, eyfc.a());
                this.c = bundle.getInt("state_account_state", 0);
                this.d = bundle.getBoolean("tiktok_accounts_disabled");
            } catch (eygu e) {
                throw new RuntimeException("Failed to get AccountInfo from Bundle.", e);
            }
        } else {
            this.e = false;
        }
        llvVar.e("tiktok_activity_account_state_saved_instance_state", new owu() { // from class: eixa
            @Override // defpackage.owu
            public final Bundle a() {
                Bundle bundle2 = new Bundle();
                eixb eixbVar = eixb.this;
                bundle2.putInt("state_account_id", eixbVar.a);
                ProtoParsers.k(bundle2, "state_account_info", eixbVar.b);
                bundle2.putInt("state_account_state", eixbVar.c);
                bundle2.putBoolean("tiktok_accounts_disabled", eixbVar.d);
                return bundle2;
            }
        });
    }
}
