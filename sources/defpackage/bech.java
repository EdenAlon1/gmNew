package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class bech {
    public String a;
    public int b;
    public becg c;
    public List d;
    public int e;
    public int f;
    private String j;
    private boolean k = false;
    public int g = 0;
    public boolean h = false;
    public String i = "_id";

    public final String a() {
        String str;
        int i;
        String str2;
        becg becgVar;
        String d = bece.d(this.b);
        csix.l(d);
        List list = this.d;
        if (list != null) {
            b((String) Collection.EL.stream(list).map(new Function() { // from class: becf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str3 = (String) obj;
                    return String.format(Locale.US, "(OLD.%s IS NOT NEW.%s)", str3, str3);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining(" OR ")));
        }
        String f = bece.f(this.b, this.c.name(), this.e);
        String b = emxe.b(this.a);
        String name = this.c.name();
        String str3 = " ";
        if (!TextUtils.isEmpty(this.j)) {
            str3 = " WHEN " + this.j + " ";
        }
        String[] strArr = btki.a;
        boolean z = this.k;
        String str4 = "";
        String str5 = true != z ? "" : ",account_id";
        int i2 = this.g;
        String str6 = true != this.h ? "" : ",trigger_name";
        int i3 = this.e;
        int i4 = this.f;
        if (i4 == 0) {
            i4 = this.b;
        }
        becg becgVar2 = becg.INSERT;
        becg becgVar3 = this.c;
        String str7 = this.i;
        if (z) {
            str = "";
            i = i2;
            str2 = str7;
            becgVar = becgVar2;
            str4 = ",".concat("IFNULL((SELECT " + btro.c.a.toString() + " FROM linked_account WHERE " + btro.c.a.toString() + " IS NOT NULL LIMIT 1),-1)");
        } else {
            str = "";
            i = i2;
            becgVar = becgVar2;
            str2 = str7;
        }
        int i5 = this.g;
        String h = i5 == 0 ? str : a.h(i5, ",");
        String concat = f.concat(b);
        String a = this.h ? a.a(concat, ",'", "'") : str;
        StringBuilder sb = new StringBuilder("CREATE TRIGGER ");
        sb.append(concat);
        sb.append(" AFTER ");
        sb.append(name);
        sb.append(" ON ");
        sb.append(d);
        sb.append(str3);
        sb.append("BEGIN INSERT INTO generic_worker_queue (worker_type,enqueued_timestamp,item_table_type,item_id");
        sb.append(str5);
        sb.append(i == 0 ? str : ",flags");
        sb.append(str6);
        sb.append(") SELECT ");
        sb.append(i3);
        sb.append(",CURRENT_TIMESTAMP,");
        sb.append(i4);
        sb.append(",");
        sb.append(becgVar == becgVar3 ? "NEW" : "OLD");
        sb.append(".");
        sb.append(str2);
        sb.append(str4);
        sb.append(h);
        sb.append(a);
        sb.append("; END");
        return sb.toString();
    }

    public final void b(String str) {
        if (str == null) {
            return;
        }
        if (TextUtils.isEmpty(this.j)) {
            this.j = str;
            return;
        }
        String str2 = this.j;
        str2.getClass();
        this.j = str2.concat(a.a(str, " AND (", ")"));
    }

    public final void c() {
        this.k = true;
    }
}
