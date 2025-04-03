package defpackage;

import com.google.communication.synapse.security.scytale.NativeBaseCrypto;
import com.google.communication.synapse.security.scytale.Scope;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cagr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cagp b;
    final /* synthetic */ cagt c;
    final /* synthetic */ Scope d;
    Object e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cagr(ffgu ffguVar, cagp cagpVar, cagt cagtVar, Scope scope) {
        super(2, ffguVar);
        this.b = cagpVar;
        this.c = cagtVar;
        this.d = scope;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cagr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        String str;
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            obj2 = this.e;
            str = (String) this.f;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            awui awuiVar = this.b.c;
            if (awuiVar == null) {
                awuiVar = awui.a;
            }
            if (awuiVar == null) {
                throw new IllegalStateException("No self identity is available.");
            }
            str = awuiVar.d;
            str.getClass();
            if (str.length() == 0) {
                throw new IllegalStateException("No identifier available in the self identity chat endpoint.");
            }
            String str2 = this.b.d;
            str2.getClass();
            elfl a = ((bzvx) this.c.b.b()).a(str);
            this.f = str;
            this.e = str2;
            this.a = 1;
            Object c = fgfz.c(a, this);
            if (c == ffhhVar) {
                return ffhhVar;
            }
            obj2 = str2;
            obj = c;
        }
        csjb c2 = cagt.a.c();
        c2.I("Deleting etouffee data");
        c2.k(str);
        String str3 = (String) obj2;
        c2.h(bdhg.a(str3));
        c2.r();
        cafo.b(((NativeBaseCrypto) obj).deleteMessageData(this.d, str3));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cagr cagrVar = new cagr(ffguVar, this.b, this.c, this.d);
        cagrVar.f = obj;
        return cagrVar;
    }
}
