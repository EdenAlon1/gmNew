package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyqt implements cyqj {
    private final Context a;
    private final boolean b;
    private final boolean c;
    private final eoxn d;
    private final enhk e;
    private final aqux f;
    private final boolean g;
    private final engw h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;

    public cyqt(Context context, boolean z, boolean z2, eoxn eoxnVar, enhk enhkVar, aqux aquxVar, boolean z3, engw engwVar) {
        this.a = context;
        this.b = z;
        this.c = z2;
        this.d = eoxnVar;
        this.e = enhkVar;
        this.f = aquxVar;
        this.g = z3;
        this.h = engwVar;
        String string = context.getString(R.string.more_about_rcs_chats);
        string.getClass();
        this.i = string;
        String string2 = context.getString(R.string.encryption_status_details_off, string);
        string2.getClass();
        this.j = string2;
        String string3 = context.getString(R.string.encryption_status_details_send_only_xms, string);
        string3.getClass();
        this.k = string3;
        String string4 = context.getString(R.string.encryption_status_details_off, string);
        string4.getClass();
        this.l = string4;
        String string5 = context.getResources().getString(R.string.encryption_status_details_on_default_v3, string);
        string5.getClass();
        this.m = string5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cyqj
    public final cyqq a() {
        String string;
        eoxn eoxnVar;
        boolean z = this.c;
        int i = (!z || !this.b || (eoxnVar = this.d) == eoxn.SEND_MODE_XMS || eoxnVar == eoxn.SEND_MODE_XMS_LATCH) ? 2 : 1;
        if (this.b) {
            eoxn eoxnVar2 = this.d;
            if (eoxnVar2 == eoxn.SEND_MODE_XMS) {
                string = this.k;
            } else if (eoxnVar2 == eoxn.SEND_MODE_XMS_LATCH) {
                string = this.l;
            } else if (z && this.e.size() == 1) {
                aqux aquxVar = this.f;
                if (aquxVar != null) {
                    String p = aquxVar.p();
                    if (asmb.a()) {
                        string = this.a.getString(R.string.encryption_status_details_on_1on1_v4, cuxh.b(p), this.i);
                        string.getClass();
                    } else {
                        string = this.a.getString(R.string.encryption_status_details_on_1on1_v3, cuxh.b(p), this.i);
                        string.getClass();
                    }
                } else if (asmb.a()) {
                    string = this.a.getString(R.string.encryption_status_details_on_1on1_fallback_v4, this.i);
                    string.getClass();
                } else {
                    string = this.a.getString(R.string.encryption_status_details_on_1on1_fallback_v3, this.i);
                    string.getClass();
                }
            } else if (this.c && this.e.size() != 1) {
                string = this.m;
            } else if (this.g) {
                if (this.h.size() == 1) {
                    string = this.a.getString(R.string.encryption_status_user, (String) this.h.get(0), this.i);
                }
                string = null;
            } else {
                int size = this.h.size();
                if (size != 0) {
                    if (size == 1) {
                        string = this.a.getString(R.string.encryption_status_self_and_other_user, (String) this.h.get(0), this.i);
                    }
                    string = null;
                } else {
                    string = this.a.getString(R.string.encryption_status_self, this.i);
                }
            }
        } else {
            string = this.j;
        }
        return new cyqq(i, string);
    }
}
