package defpackage;

import com.google.android.gms.auth.folsom.SecurityDomainMember;
import com.google.android.gms.auth.folsom.internal.ISecurityDomainMembersCallback;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfgx extends ISecurityDomainMembersCallback.Stub {
    final /* synthetic */ dhri a;

    public dfgx(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.auth.folsom.internal.ISecurityDomainMembersCallback
    public final void onResult(Status status, List<SecurityDomainMember> list) {
        if (status.d()) {
            this.a.b(list);
        } else {
            this.a.a(dfve.a(status));
        }
    }
}
