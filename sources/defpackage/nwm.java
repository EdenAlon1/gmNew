package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nwm extends nzh {
    public Intent a;
    public String b;

    public nwm(oaj oajVar) {
        super(oajVar);
    }

    private static final String g(Context context, String str) {
        if (str == null) {
            return null;
        }
        String packageName = context.getPackageName();
        packageName.getClass();
        return ffpc.q(str, "${applicationId}", packageName);
    }

    @Override // defpackage.nzh
    public final void a(Context context, AttributeSet attributeSet) {
        super.a(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, oao.a);
        obtainAttributes.getClass();
        String g = g(context, obtainAttributes.getString(4));
        if (this.a == null) {
            this.a = new Intent();
        }
        Intent intent = this.a;
        intent.getClass();
        intent.setPackage(g);
        String string = obtainAttributes.getString(0);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = String.valueOf(context.getPackageName()).concat(string);
            }
            ComponentName componentName = new ComponentName(context, string);
            if (this.a == null) {
                this.a = new Intent();
            }
            Intent intent2 = this.a;
            intent2.getClass();
            intent2.setComponent(componentName);
        }
        String string2 = obtainAttributes.getString(1);
        if (this.a == null) {
            this.a = new Intent();
        }
        Intent intent3 = this.a;
        intent3.getClass();
        intent3.setAction(string2);
        String g2 = g(context, obtainAttributes.getString(2));
        if (g2 != null) {
            Uri parse = Uri.parse(g2);
            if (this.a == null) {
                this.a = new Intent();
            }
            Intent intent4 = this.a;
            intent4.getClass();
            intent4.setData(parse);
        }
        this.b = g(context, obtainAttributes.getString(3));
        obtainAttributes.recycle();
    }

    @Override // defpackage.nzh
    public final boolean b() {
        return false;
    }

    @Override // defpackage.nzh
    public final boolean equals(Object obj) {
        Intent intent;
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof nwm) && super.equals(obj) && ((intent = this.a) == null ? ((nwm) obj).a == null : intent.filterEquals(((nwm) obj).a)) && ffkj.e(this.b, ((nwm) obj).b);
    }

    @Override // defpackage.nzh
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Intent intent = this.a;
        int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.b;
        return filterHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.nzh
    public final String toString() {
        Intent intent = this.a;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (component != null) {
            sb.append(" class=");
            sb.append(component.getClassName());
        } else {
            Intent intent2 = this.a;
            String action = intent2 != null ? intent2.getAction() : null;
            if (action != null) {
                sb.append(" action=");
                sb.append(action);
            }
        }
        return sb.toString();
    }
}
