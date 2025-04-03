package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.people.internal.IPeopleService;
import com.google.android.gms.people.internal.PeopleClientImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhjd extends dhjf {
    final /* synthetic */ String a;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhjd(dfre dfreVar, String str, int i) {
        super(dfreVar);
        this.a = str;
        this.h = i;
    }

    @Override // defpackage.dfsd
    protected final /* synthetic */ void b(dfqk dfqkVar) {
        ICancelToken iCancelToken;
        PeopleClientImpl peopleClientImpl = (PeopleClientImpl) dfqkVar;
        dhiw dhiwVar = new dhiw(this);
        String str = this.a;
        int i = this.h;
        try {
            IPeopleService M = peopleClientImpl.M();
            Context context = peopleClientImpl.w;
            iCancelToken = M.loadOwnerAvatar(dhiwVar, str, null, i, 1, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
        } catch (RemoteException unused) {
            dhiwVar.onParcelFileDescriptorLoaded(8, null, null, null);
            iCancelToken = null;
        }
        synchronized (this.c) {
            this.f = iCancelToken;
        }
    }
}
