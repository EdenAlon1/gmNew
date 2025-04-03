package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.debug.DebugMmsConfigItemView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daed extends BaseAdapter implements daeg {
    public final cpbn a;
    public final cpai b;
    public final Map c;
    private final LayoutInflater d;
    private final List e;
    private final int f;
    private final cpar g;

    public daed(cpbs cpbsVar, cpai cpaiVar, cpar cparVar, Context context, int i, boolean z) {
        this.d = LayoutInflater.from(context);
        this.a = cpbsVar.a(i);
        this.f = i;
        this.g = cparVar;
        this.b = cpaiVar;
        TreeMap d = cparVar.d(i, z);
        this.c = d;
        ArrayList arrayList = new ArrayList(d.keySet());
        this.e = arrayList;
        arrayList.add(0, "How do I use this debug tool?");
    }

    final void a() {
        this.b.d.clear();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.e.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.e.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        DebugMmsConfigItemView debugMmsConfigItemView = view instanceof DebugMmsConfigItemView ? (DebugMmsConfigItemView) view : (DebugMmsConfigItemView) this.d.inflate(R.layout.debug_mmsconfig_item_view, viewGroup, false);
        String str = (String) this.e.get(i);
        if (str.equals("How do I use this debug tool?")) {
            debugMmsConfigItemView.d = str;
            debugMmsConfigItemView.a.setText(str);
            return debugMmsConfigItemView;
        }
        cpat cpatVar = (cpat) this.c.get(str);
        if (cpatVar == null) {
            return debugMmsConfigItemView;
        }
        cpar cparVar = this.g;
        int i2 = this.f;
        Object b = cpatVar.b();
        cpas a = cpatVar.a();
        TreeMap treeMap = new TreeMap();
        treeMap.put(cpas.DEFAULTS, String.valueOf(cpar.a().get(str)));
        cpai cpaiVar = (cpai) cparVar.b.b();
        cpaiVar.getClass();
        Bundle bundle = new Bundle();
        if (((cpca) cparVar.g.b()).a()) {
            bundle = ((cpcf) cparVar.d.b()).a(i2);
        } else {
            cpaiVar.d(i2, bundle, R.xml.mms_config);
        }
        treeMap.put(cpas.BUGLE_MMS_CONFIG, String.valueOf(bundle.get(str)));
        Bundle bundle2 = new Bundle();
        if (((cpca) cparVar.g.b()).a()) {
            bundle2 = ((cpcd) cparVar.c.b()).a(i2);
        }
        treeMap.put(cpas.OEM_SPECIFIC_OVERRIDE, String.valueOf(bundle2.getString(str)));
        Bundle a2 = ((cpca) cparVar.g.b()).a() ? ((cpcl) cparVar.e.b()).a(i2) : cpai.c(i2, (ctwb) cparVar.a.b());
        if (a2 != null) {
            treeMap.put(cpas.PLATFORM, String.valueOf(a2.get(str)));
        } else {
            treeMap.put(cpas.PLATFORM, "null");
        }
        if (((cpca) cparVar.g.b()).a()) {
            treeMap.put(cpas.SERVER_SIDE_OVERRIDE_MOBILE_CONFIG, String.valueOf(((cpbu) cparVar.f.b()).a(i2).get(str)));
        } else {
            treeMap.put(cpas.SERVER_SIDE_OVERRIDE_PHENOTYPE, String.valueOf(cpaiVar.b(cpce.a).get(str)));
            if (((Boolean) cpai.b.e()).booleanValue()) {
                treeMap.put(cpas.EXPERIMENT_OVERRIDE, String.valueOf(cpaiVar.b(cpai.c).get(str)));
            } else {
                treeMap.put(cpas.EXPERIMENT_OVERRIDE, "null");
            }
        }
        treeMap.put(cpas.USER_SETTING, String.valueOf(cparVar.b(i2).get(str)));
        debugMmsConfigItemView.e = this;
        debugMmsConfigItemView.d = str;
        debugMmsConfigItemView.i = cpbg.b(b);
        Context context = debugMmsConfigItemView.getContext();
        debugMmsConfigItemView.g = "(" + a.j + ") " + str;
        debugMmsConfigItemView.a.setText(debugMmsConfigItemView.g);
        StringBuilder sb = new StringBuilder("\n");
        for (Map.Entry entry : treeMap.entrySet()) {
            sb.append("(");
            sb.append(((cpas) entry.getKey()).j);
            sb.append(") ");
            sb.append(((cpas) entry.getKey()).toString().toLowerCase(ctid.c(context)));
            sb.append(" :  ");
            sb.append((String) entry.getValue());
            sb.append("\n");
        }
        debugMmsConfigItemView.h = sb.toString();
        int i3 = debugMmsConfigItemView.i;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        String obj = i4 != 4 ? i4 != 5 ? b.toString() : Arrays.toString((String[]) b) : Arrays.toString((int[]) b);
        int i5 = debugMmsConfigItemView.i;
        int i6 = i5 - 1;
        if (i5 == 0) {
            throw null;
        }
        if (i6 != 0) {
            if (i6 == 1) {
                debugMmsConfigItemView.c.setVisibility(0);
                debugMmsConfigItemView.b.setVisibility(8);
                debugMmsConfigItemView.c.setChecked(Boolean.parseBoolean(obj));
                return debugMmsConfigItemView;
            }
            if (i6 != 2 && i6 != 3 && i6 != 4 && i6 != 5) {
                debugMmsConfigItemView.b.setVisibility(8);
                debugMmsConfigItemView.c.setVisibility(8);
                csjy.f("Bugle", "Unexpected keytype: " + cpbg.a(debugMmsConfigItemView.i) + " key: " + str);
                return debugMmsConfigItemView;
            }
        }
        debugMmsConfigItemView.b.setVisibility(0);
        debugMmsConfigItemView.c.setVisibility(8);
        debugMmsConfigItemView.b.setText(obj);
        debugMmsConfigItemView.b.setMaxWidth(500);
        return debugMmsConfigItemView;
    }
}
