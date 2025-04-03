package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebbg extends ebbb {
    public final Context a;
    public final ebbc b;
    public final eave c;
    public final ebas d;
    public final ebga e;
    public final ebtw f;
    public final ebfw g;
    public final emxc h;
    public final eawd i;
    public final ExecutorService j;
    public final ebvw k;
    public final ebun l;
    public final emxc m;
    private final eawd n;
    private final dwch o;
    private final emxc p;

    public ebbg(Context context, ebbc ebbcVar, eave eaveVar, ebas ebasVar, ebga ebgaVar, ebtw ebtwVar, ebfw ebfwVar, emxc emxcVar, eawd eawdVar, eawd eawdVar2, ExecutorService executorService, dwch dwchVar, ebvw ebvwVar, ebun ebunVar, emxc emxcVar2, emxc emxcVar3) {
        this.a = context;
        this.b = ebbcVar;
        this.c = eaveVar;
        this.d = ebasVar;
        this.e = ebgaVar;
        this.f = ebtwVar;
        this.g = ebfwVar;
        this.h = emxcVar;
        this.n = eawdVar;
        this.i = eawdVar2;
        this.j = executorService;
        this.o = dwchVar;
        this.k = ebvwVar;
        this.l = ebunVar;
        this.m = emxcVar2;
        this.p = emxcVar3;
    }

    @Override // defpackage.ebbb
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.ebbb
    public final dwch b() {
        return this.o;
    }

    @Override // defpackage.ebbb
    public final eave c() {
        return this.c;
    }

    @Override // defpackage.ebbb
    public final eawd d() {
        return this.i;
    }

    @Override // defpackage.ebbb
    public final eawd e() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        eawd eawdVar;
        ebun ebunVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebbb) {
            ebbb ebbbVar = (ebbb) obj;
            if (this.a.equals(ebbbVar.a()) && this.b.equals(ebbbVar.g()) && this.c.equals(ebbbVar.c()) && this.d.equals(ebbbVar.f()) && this.e.equals(ebbbVar.i())) {
                ebbbVar.r();
                if (this.f.equals(ebbbVar.j()) && this.g.equals(ebbbVar.h()) && this.h.equals(ebbbVar.n()) && ((eawdVar = this.n) != null ? eawdVar.equals(ebbbVar.e()) : ebbbVar.e() == null) && this.i.equals(ebbbVar.d())) {
                    ebbbVar.q();
                    if (this.j.equals(ebbbVar.p()) && this.o.equals(ebbbVar.b()) && this.k.equals(ebbbVar.l()) && ((ebunVar = this.l) != null ? ebunVar.equals(ebbbVar.k()) : ebbbVar.k() == null) && this.m.equals(ebbbVar.m()) && this.p.equals(ebbbVar.o())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ebbb
    public final ebas f() {
        return this.d;
    }

    @Override // defpackage.ebbb
    public final ebbc g() {
        return this.b;
    }

    @Override // defpackage.ebbb
    public final ebfw h() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * (-721379959)) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
        eawd eawdVar = this.n;
        int hashCode2 = ((((((((((((hashCode * 1000003) ^ 2040732332) * 1000003) ^ (eawdVar == null ? 0 : eawdVar.hashCode())) * 1000003) ^ this.i.hashCode()) * (-721379959)) ^ this.j.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003;
        ebun ebunVar = this.l;
        return ((((hashCode2 ^ (ebunVar != null ? ebunVar.hashCode() : 0)) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    @Override // defpackage.ebbb
    public final ebga i() {
        return this.e;
    }

    @Override // defpackage.ebbb
    public final ebtw j() {
        return this.f;
    }

    @Override // defpackage.ebbb
    public final ebun k() {
        return this.l;
    }

    @Override // defpackage.ebbb
    public final ebvw l() {
        return this.k;
    }

    @Override // defpackage.ebbb
    public final emxc m() {
        return this.m;
    }

    @Override // defpackage.ebbb
    public final emxc n() {
        return this.h;
    }

    @Override // defpackage.ebbb
    public final emxc o() {
        return this.p;
    }

    @Override // defpackage.ebbb
    public final ExecutorService p() {
        return this.j;
    }

    public final String toString() {
        ebun ebunVar = this.l;
        ebvw ebvwVar = this.k;
        dwch dwchVar = this.o;
        ExecutorService executorService = this.j;
        eawd eawdVar = this.i;
        eawd eawdVar2 = this.n;
        ebfw ebfwVar = this.g;
        ebtw ebtwVar = this.f;
        ebga ebgaVar = this.e;
        ebas ebasVar = this.d;
        eave eaveVar = this.c;
        ebbc ebbcVar = this.b;
        return "AccountMenuManager{applicationContext=" + this.a.toString() + ", accountsModel=" + ebbcVar.toString() + ", accountConverter=" + eaveVar.toString() + ", clickListeners=" + ebasVar.toString() + ", features=" + ebgaVar.toString() + ", avatarRetriever=null, oneGoogleEventLogger=" + ebtwVar.toString() + ", configuration=" + ebfwVar.toString() + ", incognitoModel=Optional.absent(), customAvatarImageLoader=" + String.valueOf(eawdVar2) + ", avatarImageLoader=" + eawdVar.toString() + ", accountClass=null, backgroundExecutor=" + executorService.toString() + ", vePrimitives=" + dwchVar.toString() + ", visualElements=" + ebvwVar.toString() + ", oneGoogleStreamz=" + String.valueOf(ebunVar) + ", appIdentifier=Optional.absent(), veAuthSideChannelGetter=Optional.absent()}";
    }

    @Override // defpackage.ebbb
    @Deprecated
    public final void q() {
    }

    @Override // defpackage.ebbb
    public final void r() {
    }
}
