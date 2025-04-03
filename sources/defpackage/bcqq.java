package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcqq {
    private static final cskc o = cskc.g("BugleDataModel", "ContactListItemData");
    public long a;
    public long b;
    public String c;
    public long d;
    public String e;
    public String f;
    public Uri g;
    public ArrayList h;
    public qmc i;
    public CharSequence j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final bcqo n;
    private final Context p;
    private final cpdg q;
    private final csqw r;
    private final cuxh s;
    private final azze t;

    public bcqq(Context context, bcqo bcqoVar, cpdg cpdgVar, csqw csqwVar, cuxh cuxhVar, azze azzeVar) {
        this.p = context;
        this.n = bcqoVar;
        this.q = cpdgVar;
        this.r = csqwVar;
        this.s = cuxhVar;
        this.t = azzeVar;
    }

    private static boolean g(String str) {
        return TextUtils.isEmpty(str) || str.trim().length() == 0;
    }

    public final int a() {
        return this.h.size();
    }

    public final qmc b(bcqp bcqpVar) {
        if (TextUtils.isEmpty(bcqpVar.a.p(((Boolean) aolr.a.e()).booleanValue())) || !this.h.contains(bcqpVar)) {
            throw new IllegalStateException(String.valueOf(cskt.b(((aoks) bcqpVar.a).o())).concat(" doesn't belong to this contact"));
        }
        qmc qmcVar = this.i;
        return qmcVar != null ? qmcVar : this.r.m(this.e, bcqpVar.a, bcqpVar.b, bcqpVar.c, this.b, this.c, -1L, this.a, this.g, this.l);
    }

    public final bcqp c(int i) {
        return (bcqp) this.h.get(i);
    }

    public final String d(String str) {
        String string;
        if (!TextUtils.isEmpty(str)) {
            return this.s.c(str);
        }
        String b = cuxh.b(emxe.b(((bcqp) this.h.get(0)).a.G().a));
        return (!crmb.a(this.b) || (string = this.p.getResources().getString(R.string.contact_list_send_to_text, b)) == null) ? b : string;
    }

    public final void e(Cursor cursor) {
        ArrayList arrayList;
        int i;
        this.a = cursor.getLong(7);
        this.b = cursor.getLong(0);
        this.c = cursor.getString(6);
        this.d = -1L;
        this.f = cursor.getString(9);
        String string = cursor.getString(2);
        this.g = string != null ? Uri.parse(string) : null;
        this.k = false;
        String string2 = cursor.getString(3);
        String string3 = cursor.getString(4);
        String string4 = cursor.getString(5);
        if (g(string2)) {
            o.r("destinationsString is null.");
            arrayList = new ArrayList();
            arrayList.add(this.n.a(this.p.getString(R.string.sim_settings_unknown_number), 12, null));
        } else {
            if (string3 == null) {
                string3 = "7";
            }
            String[] split = string2.split("\u001f", -1);
            String[] split2 = string3.split("\u001f", -1);
            int length = split.length;
            int length2 = split2.length;
            if (length != length2) {
                csix.c("destination arrays are different lengths");
            }
            int min = Math.min(length, length2);
            ArrayList arrayList2 = new ArrayList(min);
            if (string4 != null) {
                String[] split3 = string4.split("\u001f", -1);
                Collections.addAll(arrayList2, new String[split3.length]);
                for (int i2 = 0; i2 < split3.length; i2++) {
                    String str = split3[i2];
                    if (str != null && !str.equals("\u0000")) {
                        arrayList2.set(i2, str);
                    }
                }
            }
            if (arrayList2.size() < min) {
                Collections.addAll(arrayList2, new String[min - arrayList2.size()]);
            }
            cmh cmhVar = new cmh(min);
            for (int i3 = 0; i3 < min; i3++) {
                try {
                    i = Integer.parseInt(split2[i3]);
                } catch (NumberFormatException e) {
                    csjb e2 = o.e();
                    e2.I(split2[i3]);
                    e2.I("is not a valid destination type.");
                    e2.s(e);
                    i = 7;
                }
                String str2 = (String) arrayList2.get(i3);
                if (!g(split[i3])) {
                    String e3 = this.q.e(split[i3]);
                    split[i3] = e3;
                    bcqp a = this.n.a(e3, i, str2);
                    bcqp bcqpVar = (bcqp) cmhVar.get(a.a);
                    boolean booleanValue = ((Boolean) aolr.a.e()).booleanValue();
                    if (bcqpVar != null) {
                        if (emxe.b(a.a.p(booleanValue)).length() <= emxe.b(bcqpVar.a.p(booleanValue)).length()) {
                        }
                    }
                    cmhVar.put(a.a, a);
                }
            }
            arrayList = new ArrayList(cmhVar.values());
            Collections.sort(arrayList);
        }
        this.h = arrayList;
        String string5 = cursor.getString(1);
        String d = d(string5);
        this.j = d;
        if (string5 == null) {
            string5 = d.toString();
        }
        this.e = string5;
        this.l = true;
        if (!cursor.isFirst() && cursor.moveToPrevious()) {
            if (this.b == cursor.getLong(0)) {
                this.l = false;
            }
            cursor.moveToNext();
        }
        this.i = null;
        if (this.h.size() == 1) {
            this.i = b((bcqp) this.h.get(0));
        }
        long j = this.b;
        enru enruVar = csqw.a;
        this.m = ContactsContract.Contacts.isEnterpriseContactId(j);
    }

    public final Uri f() {
        return this.t.a(bdqu.t(b((bcqp) this.h.get(0))));
    }
}
