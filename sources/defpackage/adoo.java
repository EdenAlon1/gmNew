package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.apps.messaging.gaia.signoutaccount.SignOutAccountActivity;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adoo implements adok {
    public final cjgc a;
    private final Context b;
    private final ffbr c;
    private final ffsk d;

    public adoo(Context context, ffbr ffbrVar, ffsk ffskVar, cjgc cjgcVar) {
        context.getClass();
        ffbrVar.getClass();
        ffskVar.getClass();
        this.b = context;
        this.c = ffbrVar;
        this.d = ffskVar;
        this.a = cjgcVar;
    }

    @Override // defpackage.adok
    public final void a(ea eaVar, eisx eisxVar, final Optional optional) {
        eisxVar.getClass();
        optional.getClass();
        if (adhu.a()) {
            Intent intent = new Intent(this.b, (Class<?>) SignOutAccountActivity.class);
            if (optional.isPresent()) {
                intent.putExtra("EXTRA_ACCOUNT_ID_TO_SWITCH_TO", (Parcelable) optional.get());
            }
            eiuy.c(intent, eisxVar);
            elhh.a(eaVar, intent);
            Optional optional2 = (Optional) this.c.b();
            final ffji ffjiVar = new ffji() { // from class: adol
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    adpp adppVar = (adpp) obj;
                    adppVar.getClass();
                    ((akzt) adppVar.b.b()).e("Bugle.SignOutAccount.EntryClicked.Count", (true != Optional.this.isPresent() ? 3 : 4) - 2);
                    return ffcu.a;
                }
            };
            optional2.ifPresent(new Consumer() { // from class: adom
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ffji.this.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (((Boolean) ((cfup) ctjd.bw.get()).e()).booleanValue()) {
                axol.k(this.d, null, new adon(this, null), 3);
            }
        }
    }
}
