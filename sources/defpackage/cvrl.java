package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.startchat.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvrl implements ffxy {
    final /* synthetic */ cvrn a;

    public cvrl(cvrn cvrnVar) {
        this.a = cvrnVar;
    }

    @Override // defpackage.ffxy
    public final /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        String string;
        cwir cwirVar = (cwir) obj;
        if (!crnx.j(this.a.a)) {
            return ffcu.a;
        }
        ChipData chipData = cwirVar.b;
        if (chipData == null && cwirVar.c == null) {
            return ffcu.a;
        }
        ChipData chipData2 = cwirVar.c;
        if (chipData2 != null) {
            string = this.a.a.getString(R.string.start_chat_talkback_remove_contact, chipData2.b);
        } else {
            cvrn cvrnVar = this.a;
            chipData.getClass();
            string = cvrnVar.a.getString(R.string.start_chat_talkback_add_contact, chipData.b);
        }
        string.getClass();
        this.a.c.a(string);
        return ffcu.a;
    }
}
