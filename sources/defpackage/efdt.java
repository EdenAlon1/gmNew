package defpackage;

import android.net.Uri;
import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efdt implements efbi {
    @Override // defpackage.efbi
    public final /* bridge */ /* synthetic */ Object a(efbh efbhVar) {
        Pair b = efbhVar.b.b(efbhVar.f);
        return new efds(((Uri) b.first).buildUpon().encodedFragment(efbhVar.e.getEncodedFragment()).build(), b);
    }
}
