package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class cvyi extends ffju implements ffjn {
    public cvyi(Object obj) {
        super(3, obj, cvyj.class, "transform", "transform(Lcom/google/common/collect/ImmutableList;Lcom/google/android/apps/messaging/startchat/tracker/ContactSelectionState;)Lcom/google/android/apps/messaging/startchat/favorites/FavoriteContactsUiData;", 4);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        engw engwVar = (engw) obj;
        final cwir cwirVar = (cwir) obj2;
        final cvyj cvyjVar = (cvyj) this.b;
        String string = cvyjVar.e.getString(R.string.favorites_title);
        string.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(engwVar, 10));
        final int i = 0;
        for (Object obj4 : engwVar) {
            int i2 = i + 1;
            if (i < 0) {
                ffdx.l();
            }
            final amar amarVar = (amar) obj4;
            arrayList.add(new dmyz(new ffix() { // from class: cvyg
                @Override // defpackage.ffix
                public final Object invoke() {
                    cvyj cvyjVar2 = cvyj.this;
                    tud tudVar = (tud) cvyjVar2.d.b();
                    amar amarVar2 = amarVar;
                    amarVar2.getClass();
                    cwir cwirVar2 = cwirVar;
                    boolean z = false;
                    if (cwirVar2.d.e() && cwirVar2.a(amarVar2)) {
                        z = true;
                    }
                    return new dmyy(tudVar.b(amarVar2, z), amarVar2.d(), cvyjVar2.a.a(amarVar2, i, cwirVar2.d, true), null, 8);
                }
            }));
            i = i2;
        }
        return new cvyk(new dmyw(string, engq.a(arrayList)), true);
    }
}
