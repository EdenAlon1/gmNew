package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.ProblematicConversationDataView;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adyj implements adyp {
    public final LinearLayout a;
    public final TextView b;
    public final CheckBox c;
    public final List d = new ArrayList();
    public ConversationIdType e = bdgq.a;
    public SpannableString f;
    private final Context g;
    private final TextView h;

    public adyj(ProblematicConversationDataView problematicConversationDataView) {
        this.g = problematicConversationDataView.getContext();
        this.a = (LinearLayout) problematicConversationDataView.findViewById(R.id.message_data_container);
        this.b = (TextView) problematicConversationDataView.findViewById(R.id.conversation_name);
        CheckBox checkBox = (CheckBox) problematicConversationDataView.findViewById(R.id.conversation_selection_checkbox);
        this.c = checkBox;
        this.h = (TextView) problematicConversationDataView.findViewById(R.id.conversation_message_count);
        problematicConversationDataView.setOnClickListener(new View.OnClickListener() { // from class: adyg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                adyj.this.c.toggle();
            }
        });
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: adyh
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                adyj adyjVar = adyj.this;
                Iterator it = adyjVar.d.iterator();
                while (it.hasNext()) {
                    ((adyq) it.next()).c.setChecked(z);
                }
                adyjVar.a();
            }
        });
    }

    public final void a() {
        long size = this.d.size();
        long count = Collection.EL.stream(this.d).filter(new Predicate() { // from class: adyi
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((adyq) obj).a();
            }
        }).count();
        if (count == size) {
            this.c.setChecked(true);
        }
        if (count == 0) {
            this.c.setChecked(false);
        }
        this.h.setText(this.g.getString(R.string.problematic_conversation_message_counter_text, Long.valueOf(count), Long.valueOf(size)));
    }
}
