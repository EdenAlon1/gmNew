package defpackage;

import android.os.Bundle;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwvm extends cwvw {
    public Optional aj;
    public ffbr ak;
    public Optional al;

    @Override // defpackage.akuc
    protected final boolean bf() {
        return false;
    }

    @Override // defpackage.ont
    public final void t(Bundle bundle) {
        this.aj.ifPresent(new Consumer() { // from class: cwvj
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((ctiu) ((fazb) obj).b()).a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.b.f("bugle");
        gi(R.xml.federated_learning_preferences);
        b().ag();
        if (this.aj.isPresent()) {
            Preference l = b().l(Y(R.string.p2p_conversation_suggestions_training_enabled_pref_key));
            if (l == null) {
                csix.c("Federated learning preference was null.");
            } else {
                l.Z();
                l.n = new onh() { // from class: cwvk
                    @Override // defpackage.onh
                    public final boolean a(Preference preference, Object obj) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        cwvm cwvmVar = cwvm.this;
                        ((ctiu) ((fazb) cwvmVar.aj.get()).b()).f(booleanValue);
                        if (booleanValue) {
                            ((alef) cwvmVar.ak.b()).e(3, 3);
                            return true;
                        }
                        ((alef) cwvmVar.ak.b()).f(3);
                        cwvmVar.al.ifPresent(new Consumer() { // from class: cwvl
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj2) {
                                ((cfyq) obj2).b();
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        return true;
                    }
                };
            }
        }
    }
}
