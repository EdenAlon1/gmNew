package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ucb implements TextWatcher {
    final /* synthetic */ boolean a;
    final /* synthetic */ ucd b;
    private boolean c;

    public ucb(ucd ucdVar, boolean z) {
        this.a = z;
        this.b = ucdVar;
        this.c = z;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(final CharSequence charSequence, int i, int i2, int i3) {
        if (this.c) {
            this.c = false;
        } else {
            this.b.u();
        }
        if (((bzqa) this.b.S.b()).i()) {
            if (eoks.CONVERSATION_TYPE_GROUP_RCS.equals(this.b.I.y())) {
                ucd ucdVar = this.b;
                if (ucdVar.I.j) {
                    int length = charSequence.length();
                    Optional optional = ucdVar.z.H().c.aq;
                    if (optional.isPresent() && length >= ((Integer) optional.get()).intValue()) {
                        ((ddzb) this.b.R.b()).h(R.string.text_limit_reached_toast_alert);
                    }
                }
            }
        }
        if (ctjd.c()) {
            ((Optional) this.b.T.b()).ifPresent(new Consumer() { // from class: uca
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((wmu) obj).n(charSequence);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
