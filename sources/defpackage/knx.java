package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knx implements Iterable {
    public final Context a;
    private final ArrayList b = new ArrayList();

    public knx(Context context) {
        this.a = context;
    }

    public final PendingIntent a(int i, int i2) {
        if (this.b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) this.b.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return PendingIntent.getActivities(this.a, i, intentArr, i2, null);
    }

    public final void b() {
        if (this.b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.b.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.a.startActivities(intentArr, null);
    }

    public final Intent[] c() {
        int size = this.b.size();
        Intent[] intentArr = new Intent[size];
        if (size != 0) {
            intentArr[0] = new Intent((Intent) this.b.get(0)).addFlags(268484608);
            for (int i = 1; i < size; i++) {
                intentArr[i] = new Intent((Intent) this.b.get(i));
            }
        }
        return intentArr;
    }

    public final void d(Intent intent) {
        this.b.add(intent);
    }

    public final void e(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.a.getPackageManager());
        }
        if (component != null) {
            f(component);
        }
        d(intent);
    }

    public final void f(ComponentName componentName) {
        int size = this.b.size();
        try {
            Intent b = klr.b(this.a, componentName);
            while (b != null) {
                this.b.add(size, b);
                b = klr.b(this.a, b.getComponent());
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.b.iterator();
    }
}
