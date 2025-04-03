package defpackage;

import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class cxhk implements Consumer {
    public final /* synthetic */ PreferenceScreen a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a.af((Preference) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
