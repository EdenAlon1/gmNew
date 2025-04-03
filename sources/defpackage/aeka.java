package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeka implements aema {
    private final Context a;
    private crly b;

    public aeka(Context context) {
        this.a = context;
    }

    @Override // defpackage.aema
    public final void b(aely aelyVar, boolean z) {
        this.b.g(aelyVar.e());
        if (aelyVar.e() != 0 || aelyVar.B() == null) {
            return;
        }
        Integer B = aelyVar.B();
        B.getClass();
        ((TextView) this.b.b()).setTextColor(B.intValue() == 0 ? ehdr.b(this.b.b(), R.attr.colorPrimary) : ehdr.b(this.b.b(), R.attr.colorOnPrimary));
        TextView textView = (TextView) this.b.b();
        Integer B2 = aelyVar.B();
        B2.getClass();
        int intValue = B2.intValue();
        textView.setText(intValue > 999 ? this.a.getString(R.string.overflow_unread_count) : String.valueOf(intValue));
    }

    @Override // defpackage.aema
    public final void c(View view) {
        this.b = new crly(view, R.id.unread_badge_view_with_message_count_stub, R.id.unread_badge_with_message_count);
    }

    @Override // defpackage.aema
    public final boolean d(aely aelyVar, aely aelyVar2) {
        boolean ab = aelyVar.ab();
        boolean ab2 = aelyVar2.ab();
        aelyVar.T();
        aelyVar2.T();
        return (Objects.equals(aelyVar.B(), aelyVar2.B()) && ab == ab2) ? false : true;
    }

    @Override // defpackage.aema
    public final void e(aelx aelxVar, aeki aekiVar) {
        boolean c = aeja.c(aekiVar);
        ((aelu) aelxVar).G = Integer.valueOf(aekiVar.k());
        aelxVar.o(true != c ? 0 : 8);
    }

    @Override // defpackage.aema
    public final /* synthetic */ aely a(aely aelyVar) {
        return aelyVar;
    }
}
