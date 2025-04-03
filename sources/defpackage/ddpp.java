package defpackage;

import com.android.vcard.VCardConstants;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddpp extends ddqj {
    public final cbpb a;
    public final int b;
    private final ddpv c;
    private final List d;
    private final List e;

    public ddpp(cbpb cbpbVar, int i, ddpv ddpvVar, List list, List list2) {
        this.a = cbpbVar;
        this.b = i;
        this.c = ddpvVar;
        if (list == null) {
            throw new NullPointerException("Null locationCardPresenters");
        }
        this.d = list;
        if (list2 == null) {
            throw new NullPointerException("Null linkCardViewModels");
        }
        this.e = list2;
    }

    @Override // defpackage.ddqj
    public final cbpb a() {
        return this.a;
    }

    @Override // defpackage.ddqj
    public final ddpv b() {
        return this.c;
    }

    @Override // defpackage.ddqj
    public final List c() {
        return this.e;
    }

    @Override // defpackage.ddqj
    public final List d() {
        return this.d;
    }

    @Override // defpackage.ddqj
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ddqj) {
            ddqj ddqjVar = (ddqj) obj;
            if (this.a.equals(ddqjVar.a()) && this.b == ddqjVar.e() && this.c.equals(ddqjVar.b()) && enkr.h(this.d, ddqjVar.d()) && enkr.h(this.e, ddqjVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        int i = this.b;
        String obj = this.a.toString();
        String str = i != 1 ? i != 2 ? i != 3 ? "MULTI_RESULT_TYPE" : "SINGLE_RESULT_TYPE" : "NO_RESULTS" : VCardConstants.PARAM_TYPE_HOME;
        ddpv ddpvVar = this.c;
        List list = this.d;
        List list2 = this.e;
        return "SearchResultsViewState{results=" + obj + ", state=" + str + ", conversationSearchViewData=" + ddpvVar.toString() + ", locationCardPresenters=" + list.toString() + ", linkCardViewModels=" + list2.toString() + "}";
    }
}
