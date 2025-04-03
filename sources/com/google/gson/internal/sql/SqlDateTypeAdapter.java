package com.google.gson.internal.sql;

import defpackage.a;
import defpackage.evkn;
import defpackage.evlb;
import defpackage.evlf;
import defpackage.evlg;
import defpackage.evpj;
import defpackage.evpl;
import defpackage.evpn;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class SqlDateTypeAdapter extends evlf {
    public static final evlg a = new evlg() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // defpackage.evlg
        public final evlf a(evkn evknVar, evpj evpjVar) {
            if (evpjVar.a == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat b = new SimpleDateFormat("MMM d, yyyy");

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            evpnVar.j();
            return;
        }
        synchronized (this) {
            format = this.b.format((java.util.Date) date);
        }
        evpnVar.m(format);
    }

    @Override // defpackage.evlf
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Date a(evpl evplVar) {
        Date date;
        if (evplVar.t() == 9) {
            evplVar.p();
            return null;
        }
        String j = evplVar.j();
        synchronized (this) {
            TimeZone timeZone = this.b.getTimeZone();
            try {
                try {
                    date = new Date(this.b.parse(j).getTime());
                } catch (ParseException e) {
                    throw new evlb(a.Q(j, evplVar, "Failed parsing '", "' as SQL Date; at path "), e);
                }
            } finally {
                this.b.setTimeZone(timeZone);
            }
        }
        return date;
    }
}
