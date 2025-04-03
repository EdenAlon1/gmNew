package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvmm extends ArrayAdapter {
    final /* synthetic */ cvmn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvmm(cvmn cvmnVar, Context context, List list) {
        super(context, R.layout.sms_free_storage_action_item_view, list);
        this.a = cvmnVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(final int i, View view, ViewGroup viewGroup) {
        TextView textView = view instanceof TextView ? (TextView) view : (TextView) LayoutInflater.from(getContext()).inflate(R.layout.sms_free_storage_action_item_view, viewGroup, false);
        textView.setText((String) getItem(i));
        textView.setOnClickListener(new View.OnClickListener() { // from class: cvml
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                cvmm cvmmVar = cvmm.this;
                cvmmVar.a.hw();
                cvmq cvmqVar = new cvmq();
                Bundle bundle = new Bundle();
                bundle.putInt("action_index", i);
                cvmqVar.at(bundle);
                fr frVar = cvmmVar.a.B;
                if (frVar != null) {
                    cvmqVar.t(frVar, null);
                }
            }
        });
        return textView;
    }
}
