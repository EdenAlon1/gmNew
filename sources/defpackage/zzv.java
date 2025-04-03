package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zzv implements ffji {
    final /* synthetic */ ffrf a;
    final /* synthetic */ zzw b;

    public zzv(ffrf ffrfVar, zzw zzwVar) {
        this.a = ffrfVar;
        this.b = zzwVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ajiy ajiyVar = (ajiy) obj;
        ajiyVar.getClass();
        this.a.d(new zzr(ajiyVar));
        String string = this.b.b.getResources().getString(R.string.scheduled_message_overwrite_draft_message);
        string.getClass();
        String string2 = this.b.b.getResources().getString(R.string.scheduled_message_dialog_continue);
        string2.getClass();
        doas doasVar = new doas(string2, new zzs(this.a));
        String string3 = this.b.b.getResources().getString(R.string.scheduled_message_dialog_back);
        string3.getClass();
        return new dmve(string, null, null, null, false, false, doasVar, new doas(string3, new zzt(this.a)), new zzu(this.a), 62);
    }
}
