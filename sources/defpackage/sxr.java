package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sxr implements ffxy {
    final /* synthetic */ sxx a;

    public sxr(sxx sxxVar) {
        this.a = sxxVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        ((Boolean) obj).booleanValue();
        sxx sxxVar = this.a;
        String string = sxxVar.a.getString(R.string.blocked_recipients_in_conversation_message);
        string.getClass();
        Object a = sxxVar.d.a(new ablt(string, null, true, 0, null, 117), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }
}
