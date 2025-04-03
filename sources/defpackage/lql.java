package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lql {
    public Uri a;
    public lqm b;
    public lqr c;
    private String d;
    private String e;
    private lqp f;
    private List g;
    private engw h;
    private long i;
    private lqz j;
    private final lqu k;

    public lql() {
        this.b = new lqm();
        this.f = new lqp();
        this.g = Collections.EMPTY_LIST;
        int i = engw.d;
        this.h = enou.a;
        this.c = new lqr();
        this.k = lqu.a;
        this.i = -9223372036854775807L;
    }

    public final lqw a() {
        lqt lqtVar;
        Uri uri = this.f.b;
        lti.c(true);
        Uri uri2 = this.a;
        if (uri2 != null) {
            String str = this.e;
            lqp lqpVar = this.f;
            lqtVar = new lqt(uri2, str, lqpVar.a != null ? new lqq(lqpVar) : null, this.g, this.h, this.i);
        } else {
            lqtVar = null;
        }
        String str2 = this.d;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        lqo lqoVar = new lqo(this.b);
        lqs lqsVar = new lqs(this.c);
        lqz lqzVar = this.j;
        if (lqzVar == null) {
            lqzVar = lqz.a;
        }
        return new lqw(str3, lqoVar, lqtVar, lqsVar, lqzVar, this.k);
    }

    public final void b(String str) {
        lti.f(str);
        this.d = str;
    }

    public lql(lqw lqwVar) {
        this();
        this.b = new lqm(lqwVar.e);
        this.d = lqwVar.a;
        this.j = lqwVar.d;
        this.c = new lqr(lqwVar.c);
        this.k = lqwVar.f;
        lqt lqtVar = lqwVar.b;
        if (lqtVar != null) {
            this.e = lqtVar.b;
            this.a = lqtVar.a;
            this.g = lqtVar.e;
            this.h = lqtVar.g;
            lqq lqqVar = lqtVar.c;
            this.f = lqqVar != null ? new lqp(lqqVar) : new lqp();
            this.i = lqtVar.i;
        }
    }
}
