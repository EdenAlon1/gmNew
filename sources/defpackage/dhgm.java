package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.people.internal.PeopleClientImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhgm extends dfqj {
    @Override // defpackage.dfqj
    public final /* bridge */ /* synthetic */ dfqr b(Context context, Looper looper, dfvs dfvsVar, Object obj, dfrc dfrcVar, dfrd dfrdVar) {
        dhgp dhgpVar = (dhgp) obj;
        dfwv.o(dhgpVar, "Must provide valid PeopleOptions!");
        return new PeopleClientImpl(context, looper, dfrcVar, dfrdVar, String.valueOf(dhgpVar.a), dfvsVar);
    }
}
