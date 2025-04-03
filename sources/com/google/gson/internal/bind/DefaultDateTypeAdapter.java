package com.google.gson.internal.bind;

import defpackage.a;
import defpackage.evkn;
import defpackage.evlb;
import defpackage.evlf;
import defpackage.evlg;
import defpackage.evmk;
import defpackage.evnl;
import defpackage.evpb;
import defpackage.evpj;
import defpackage.evpl;
import defpackage.evpn;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class DefaultDateTypeAdapter extends evlf {
    public static final evlg a = new evlg() { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter.1
        @Override // defpackage.evlg
        public final evlf a(evkn evknVar, evpj evpjVar) {
            if (evpjVar.a != Date.class) {
                return null;
            }
            evnl evnlVar = evnl.a;
            return new DefaultDateTypeAdapter();
        }

        public final String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    };
    private final List b;

    public DefaultDateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (evmk.a()) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", Locale.US));
        }
    }

    private final Date c(evpl evplVar) {
        List list = this.b;
        String j = evplVar.j();
        synchronized (list) {
            for (DateFormat dateFormat : this.b) {
                TimeZone timeZone = dateFormat.getTimeZone();
                try {
                    Date parse = dateFormat.parse(j);
                    dateFormat.setTimeZone(timeZone);
                    return parse;
                } catch (ParseException unused) {
                    dateFormat.setTimeZone(timeZone);
                } catch (Throwable th) {
                    dateFormat.setTimeZone(timeZone);
                    throw th;
                }
            }
            try {
                return evpb.a(j, new ParsePosition(0));
            } catch (ParseException e) {
                throw new evlb(a.Q(j, evplVar, "Failed parsing '", "' as Date; at path "), e);
            }
        }
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        if (evplVar.t() != 9) {
            return c(evplVar);
        }
        evplVar.p();
        return null;
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            evpnVar.j();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        synchronized (this.b) {
            format = dateFormat.format(date);
        }
        evpnVar.m(format);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ")";
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ")";
    }
}
