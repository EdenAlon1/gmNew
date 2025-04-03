package defpackage;

import android.app.Notification;
import android.app.Person;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kmo {
    static Notification.Builder a(Notification.Builder builder, Person person) {
        Notification.Builder addPerson;
        addPerson = builder.addPerson(person);
        return addPerson;
    }
}
