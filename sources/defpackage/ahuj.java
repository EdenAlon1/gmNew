package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.multishare.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahuj implements ffxy {
    final /* synthetic */ ahul a;

    public ahuj(ahul ahulVar) {
        this.a = ahulVar;
    }

    @Override // defpackage.ffxy
    public final /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        String string;
        ahut ahutVar = (ahut) obj;
        if (!crnx.j(this.a.a)) {
            return ffcu.a;
        }
        if (ahutVar.a() == null && ahutVar.b() == null) {
            return ffcu.a;
        }
        if (ahutVar.b() != null) {
            ahul ahulVar = this.a;
            ChipData b = ahutVar.b();
            b.getClass();
            string = ahulVar.a.getString(R.string.multi_share_talkback_remove_recipient, b.b);
        } else {
            ahul ahulVar2 = this.a;
            ChipData a = ahutVar.a();
            a.getClass();
            string = ahulVar2.a.getString(R.string.multi_share_talkback_add_recipient, a.b);
        }
        string.getClass();
        this.a.c.a(string);
        return ffcu.a;
    }
}
