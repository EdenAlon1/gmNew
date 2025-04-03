package defpackage;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efym extends vk {
    public engw a;
    public final dvxi d;
    public String e;
    public final efyf f;
    private final dvyc g;
    private final dvxy h;

    public efym(efyf efyfVar, dvyc dvycVar, dvxy dvxyVar, dvxi dvxiVar) {
        int i = engw.d;
        this.a = enou.a;
        this.e = "";
        this.f = efyfVar;
        this.g = dvycVar;
        this.h = dvxyVar;
        this.d = dvxiVar;
    }

    @Override // defpackage.vk
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        return new efyl(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_suggestions_item, viewGroup, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vk
    public final void g(wr wrVar, final int i) {
        final efyl efylVar = (efyl) wrVar;
        int i2 = efyl.u;
        TextView textView = efylVar.t;
        String str = (String) this.a.get(i);
        String str2 = this.e;
        if (!emxe.c(str) && !emxe.c(str2)) {
            SpannableString spannableString = new SpannableString(str);
            Iterable<String> g = emye.c(emvm.a).g(str.toLowerCase(Locale.getDefault()));
            enip n = enip.n(emye.c(emvm.a).f().a().g(str2.toLowerCase(Locale.getDefault())));
            int i3 = 0;
            for (String str3 : g) {
                enqu listIterator = n.listIterator();
                while (listIterator.hasNext()) {
                    String str4 = (String) listIterator.next();
                    if (str3.startsWith(str4)) {
                        spannableString.setSpan(new StyleSpan(1), i3, str4.length() + i3, 0);
                    }
                }
                i3 += str3.length() + 1;
            }
            str = spannableString;
        }
        textView.setText(str);
        efylVar.s.setOnClickListener(new View.OnClickListener() { // from class: efyk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dvxh e = dvxh.e();
                int i4 = efyl.u;
                efym efymVar = efym.this;
                efymVar.d.a(e, efylVar.s);
                efymVar.f.a.a((String) efymVar.a.get(i));
            }
        });
        dvxy dvxyVar = this.h;
        View view = efylVar.s;
        dvwz a = this.g.a(133698);
        a.f(dvxp.a(i));
        dvxyVar.e(view, a);
    }

    @Override // defpackage.vk
    public final void k(wr wrVar) {
        int i = efyl.u;
        this.h.c(((efyl) wrVar).s);
    }
}
