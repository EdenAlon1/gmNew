package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aejz implements aema {
    private final Context a;
    private final cqoh b;
    private final Resources c;
    private final csrh d;
    private final ffbr e;
    private final ffbr f;
    private TextView g;

    public aejz(Context context, cqoh cqohVar, csrh csrhVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = context;
        this.b = cqohVar;
        this.c = context.getResources();
        this.d = csrhVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
    }

    private final void f(aelx aelxVar, aeki aekiVar) {
        boolean z = !aekiVar.ac() && aekiVar.ag();
        aelu aeluVar = (aelu) aelxVar;
        aeluVar.b = crlw.f(this.a);
        amny t = aekiVar.t();
        amny amnyVar = amny.c;
        int i = R.attr.colorOnSurfaceVariant;
        if (t != amnyVar && !z) {
            i = R.attr.colorOnSurface;
        }
        aeluVar.u = Integer.valueOf(i);
        boolean c = aeja.c(aekiVar);
        if (!aekiVar.ah()) {
            aeluVar.a = this.d.a(aekiVar.o()).toString();
            aeluVar.c = Integer.valueOf((aekiVar.t() == amny.c || c) ? 0 : 1);
        } else {
            if (((aubg) this.f.b()).a()) {
                aeluVar.a = this.c.getString(R.string.draft_indicator_with_space);
            } else {
                aeluVar.a = this.c.getString(R.string.draft_indicator);
            }
            aeluVar.c = Integer.valueOf(true != c ? 3 : 2);
        }
    }

    @Override // defpackage.aema
    public final aely a(aely aelyVar) {
        if (Math.abs(this.b.f().toEpochMilli() - aelyVar.k().o()) > 3600000) {
            return aelyVar;
        }
        aelx l = aelyVar.l();
        f(l, aelyVar.k());
        return l.a();
    }

    @Override // defpackage.aema
    public final void b(aely aelyVar, boolean z) {
        if (aelyVar.Q() == null) {
            this.g.setVisibility(8);
            return;
        }
        this.g.setVisibility(0);
        this.g.setText(aelyVar.Q());
        TextView textView = this.g;
        Typeface j = aelyVar.j();
        Integer A = aelyVar.A();
        A.getClass();
        textView.setTypeface(j, A.intValue());
        TextView textView2 = this.g;
        Integer z2 = aelyVar.z();
        z2.getClass();
        textView2.setTextColor(ehdr.b(textView2, z2.intValue()));
    }

    @Override // defpackage.aema
    public final void c(View view) {
        this.g = (TextView) view.findViewById(R.id.conversation_timestamp);
    }

    @Override // defpackage.aema
    public final boolean d(aely aelyVar, aely aelyVar2) {
        boolean equals = TextUtils.equals(aelyVar2.Q(), aelyVar.Q());
        aelyVar2.ag();
        aelyVar.ag();
        boolean equals2 = Objects.equals(null, null);
        boolean ab = aelyVar.ab();
        boolean ab2 = aelyVar2.ab();
        return (equals && equals2 && ab == ab2) ? false : true;
    }

    @Override // defpackage.aema
    public final void e(aelx aelxVar, aeki aekiVar) {
        f(aelxVar, aekiVar);
    }
}
