package com.google.android.apps.messaging.ui.debug;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.cpag;
import defpackage.cpas;
import defpackage.cpbn;
import defpackage.daed;
import defpackage.daef;
import defpackage.daeg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DebugMmsConfigItemView extends LinearLayout implements View.OnClickListener, DialogInterface.OnClickListener {
    public TextView a;
    public TextView b;
    public Switch c;
    public String d;
    public daeg e;
    public EditText f;
    public String g;
    public String h;
    public int i;

    public DebugMmsConfigItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        daeg daegVar = this.e;
        String str = this.d;
        String obj = this.f.getText().toString();
        int i2 = this.i;
        daed daedVar = (daed) daegVar;
        Object obj2 = daedVar.a.b.get(str);
        if (obj2 != null) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if ((i3 != 0 && i3 != 1 && i3 != 2 && i3 != 3) || obj2.equals(obj)) {
                return;
            }
        }
        cpbn.z(daedVar.a.b, i2, str, obj);
        cpbn.z(daedVar.b.d, i2, str, obj);
        daedVar.c.put(str, new cpag(obj, cpas.DEBUG_MENU));
        daedVar.notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.title);
        this.b = (TextView) findViewById(R.id.text_value);
        this.c = (Switch) findViewById(R.id.switch_button);
        setOnClickListener(this);
        this.c.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = getContext();
        if (this.d.equals("How do I use this debug tool?")) {
            StringBuilder sb = new StringBuilder("This is a list of carrier configs used for the mcc/mnc set in the upper left corner.");
            for (cpas cpasVar : cpas.values()) {
                sb.append(" Configs labeled with \"(");
                sb.append(cpasVar.j);
                sb.append(")\" come from source: ");
                sb.append(cpasVar.name());
                sb.append(".");
            }
            new AlertDialog.Builder(context).setTitle("Carrier Config Debug Menu").setMessage(sb.toString()).create().show();
            return;
        }
        int i = this.i;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 == 1) {
                    new AlertDialog.Builder(context).setTitle(this.g).setMessage(String.valueOf(this.c.isChecked())).setMessage(this.h).create().show();
                    return;
                } else if (i2 != 2 && i2 != 3) {
                    if (i2 == 4 || i2 == 5) {
                        new AlertDialog.Builder(context).setTitle(this.g).setMessage(this.b.getText()).create().show();
                        return;
                    }
                    return;
                }
            }
            EditText editText = new EditText(context);
            this.f = editText;
            editText.setText(this.b.getText());
            this.f.setFocusable(true);
            EditText editText2 = this.f;
            int i3 = this.i;
            if (i3 != 0) {
                editText2.setInputType(i3 == 4 ? 524288 : 3);
                AlertDialog create = new AlertDialog.Builder(context).setTitle(this.g).setView(this.f).setMessage(this.h).setPositiveButton(android.R.string.ok, this).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
                create.setOnShowListener(new daef(this, context));
                create.show();
                return;
            }
            throw null;
        }
        throw null;
    }
}
