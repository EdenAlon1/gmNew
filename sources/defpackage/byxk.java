package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class byxk extends dtrr {
    public String a;
    public ardn b;
    public String c;
    public String d;

    public byxk() {
        super(VmtTable.c());
        this.b = ardn.VMT_STATUS_UNKNOWN;
    }

    public final VmtTable.BindData a() {
        byxj byxjVar = new byxj();
        byxjVar.aC(aB());
        String str = this.a;
        if (str == null) {
            throw new IllegalStateException("field part_id cannot be null");
        }
        byxjVar.a = str;
        byxjVar.b = this.b;
        byxjVar.c = this.c;
        byxjVar.d = this.d;
        byxjVar.cK = aC();
        return byxjVar;
    }

    public final void b(String str) {
        aE(3);
        this.d = str;
    }

    public final void c(String str) {
        aE(0);
        this.a = str;
    }

    public final void d(String str) {
        aE(2);
        this.c = str;
    }

    public final void e(ardn ardnVar) {
        aE(1);
        this.b = ardnVar;
    }
}
