package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zzn implements ffji {
    final /* synthetic */ ffrf a;
    final /* synthetic */ zzw b;

    public zzn(ffrf ffrfVar, zzw zzwVar) {
        this.a = ffrfVar;
        this.b = zzwVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ajiy ajiyVar = (ajiy) obj;
        ajiyVar.getClass();
        this.a.d(new zzj(ajiyVar));
        String quantityString = this.b.b.getResources().getQuantityString(R.plurals.delete_message_confirmation_dialog_title, 1, 1);
        String string = this.b.b.getString(R.string.delete_message_confirmation_dialog_text);
        string.getClass();
        String string2 = this.b.b.getString(R.string.delete_message_confirmation_button);
        string2.getClass();
        doas doasVar = new doas(string2, new zzk(this.a));
        String string3 = this.b.b.getString(android.R.string.cancel);
        string3.getClass();
        return new dmve(string, null, null, quantityString, false, false, doasVar, new doas(string3, new zzl(this.a)), new zzm(this.a), 54);
    }
}
