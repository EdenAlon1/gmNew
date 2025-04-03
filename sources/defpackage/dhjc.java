package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.internal.PeopleClientImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhjc extends dhgn {
    final /* synthetic */ dhgd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhjc(dfre dfreVar, dhgd dhgdVar) {
        super(dfreVar);
        this.a = dhgdVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ dfrl a(Status status) {
        return new dhjb(status);
    }

    @Override // defpackage.dfsd
    protected final /* bridge */ /* synthetic */ void b(dfqk dfqkVar) {
        ((PeopleClientImpl) dfqkVar).P(this, this.a.a);
    }
}
