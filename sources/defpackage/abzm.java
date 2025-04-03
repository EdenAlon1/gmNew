package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Collection;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abzm extends vk {
    public final engw a;
    private final csrh d;
    private final ffbr e;
    private final ffbr f;
    private final RecyclerView g;

    public abzm(csrh csrhVar, ffbr ffbrVar, ffbr ffbrVar2, RecyclerView recyclerView, engw engwVar) {
        this.d = csrhVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = recyclerView;
        this.a = engwVar;
    }

    public final void F(int i) {
        q(i + 1);
    }

    final void G() {
        int m = m();
        ellj.g(new abyf(m > 0), this.g);
        ellj.g(new abye(m, Collection.EL.stream(this.a).mapToInt(new ToIntFunction() { // from class: abzg
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((abzx) obj).a();
            }
        }).sum()), this.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(boolean z, int i, int i2) {
        abzx abzxVar = (abzx) this.a.get(i);
        abzw abzwVar = (abzw) abzxVar.c.get(i2);
        if (abzwVar.e != z) {
            abzwVar.e = z;
            if (z) {
                abzxVar.d++;
            } else {
                abzxVar.d--;
            }
        }
        F(i);
        G();
    }

    @Override // defpackage.vk
    public final int a() {
        return this.a.size() + 1;
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        View inflate;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            inflate = from.inflate(R.layout.header, viewGroup, false);
        } else {
            emxf.l(i == 1);
            inflate = from.inflate(R.layout.participant_message_list, viewGroup, false);
        }
        return new abzl(inflate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        View view = ((abzl) wrVar).a;
        boolean z = false;
        if (dE(i) == 0) {
            TextView textView = (TextView) view;
            Context context = textView.getContext();
            String a = crmi.a(context);
            textView.setText(ddyi.b(context, this.e, this.f, context.getString(R.string.donation_header, a), a, acaf.a, acaf.b));
            egyl.b(textView);
            egyl.c(textView);
            return;
        }
        emxf.l(true);
        final int i2 = i - 1;
        final abzx abzxVar = (abzx) this.a.get(i2);
        emxf.l(abzxVar.a() > 0);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.parent_checkbox);
        checkBox.setText(abzxVar.b);
        int a2 = abzxVar.a();
        int i3 = abzxVar.d;
        checkBox.setOnCheckedChangeListener(null);
        checkBox.setChecked(a2 == i3);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: abzi
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                abzm abzmVar = abzm.this;
                engw engwVar = abzmVar.a;
                int i4 = i2;
                ((abzx) engwVar.get(i4)).d(z2);
                abzmVar.F(i4);
                abzmVar.G();
            }
        });
        int a3 = abzxVar.a();
        int i4 = abzxVar.d;
        Resources resources = view.getResources();
        TextView textView2 = (TextView) view.findViewById(R.id.selected_count);
        Integer valueOf = Integer.valueOf(i4);
        Integer valueOf2 = Integer.valueOf(a3);
        textView2.setText(resources.getString(R.string.donation_conversation_selected_count, valueOf, valueOf2));
        textView2.setContentDescription(resources.getString(R.string.donation_conversation_selected_count_of_total_count_content_description, resources.getQuantityString(R.plurals.donation_conversation_selected_count_content_description, i4, valueOf), resources.getQuantityString(R.plurals.donation_conversation_total_count_content_description, a3, valueOf2)));
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.message_list);
        LayoutInflater from = LayoutInflater.from(view.getContext());
        linearLayout.removeAllViews();
        final int i5 = 0;
        while (i5 < abzxVar.a()) {
            View inflate = from.inflate(R.layout.message, linearLayout, z);
            CheckBox checkBox2 = (CheckBox) inflate.findViewById(R.id.checkbox);
            Context context2 = checkBox2.getContext();
            long b = abzxVar.b(i5);
            Spanned c = abzxVar.c(i5);
            String property = System.getProperty("line.separator");
            AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(context2.getResources().getDimensionPixelSize(R.dimen.checkbox_subtext_size));
            LayoutInflater layoutInflater = from;
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ehdr.d(context2, R.attr.colorOnSurfaceVariant, "DataDonationListAdapter#createMessageCheckboxText: failed to get color R.attr.colorOnSurfaceVariant"));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.valueOf(String.valueOf(c)).concat(String.valueOf(property)));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(this.d.a(b));
            spannableStringBuilder.setSpan(absoluteSizeSpan, length, spannableStringBuilder.length(), 17);
            spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
            checkBox2.setText(spannableStringBuilder);
            checkBox2.setOnCheckedChangeListener(null);
            checkBox2.setChecked(abzxVar.e(i5));
            checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: abzk
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    abzm.this.H(z2, i2, i5);
                }
            });
            ((ImageButton) inflate.findViewById(R.id.edit_button)).setOnClickListener(new View.OnClickListener() { // from class: abzh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ellj.g(new abyc(abzx.this, i2, i5), view2);
                }
            });
            linearLayout.addView(inflate);
            i5++;
            from = layoutInflater;
            z = false;
        }
    }

    final int m() {
        return Collection.EL.stream(this.a).mapToInt(new ToIntFunction() { // from class: abze
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((abzx) obj).d;
            }
        }).sum();
    }
}
