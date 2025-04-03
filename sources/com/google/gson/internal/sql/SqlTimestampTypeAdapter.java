package com.google.gson.internal.sql;

import defpackage.evkn;
import defpackage.evlf;
import defpackage.evlg;
import defpackage.evpj;
import defpackage.evpl;
import defpackage.evpn;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class SqlTimestampTypeAdapter extends evlf {
    public static final evlg a = new evlg() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // defpackage.evlg
        public final evlf a(evkn evknVar, evpj evpjVar) {
            if (evpjVar.a == Timestamp.class) {
                return new SqlTimestampTypeAdapter(evknVar.b(Date.class));
            }
            return null;
        }
    };
    private final evlf b;

    public SqlTimestampTypeAdapter(evlf evlfVar) {
        this.b = evlfVar;
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        Date date = (Date) this.b.a(evplVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        this.b.b(evpnVar, (Timestamp) obj);
    }
}
