package defpackage;

import android.app.Person;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knp {
    public static Person a(knr knrVar) {
        Person.Builder name;
        Person.Builder icon;
        Person.Builder uri;
        Person.Builder key;
        Person.Builder bot;
        Person.Builder important;
        Person build;
        name = new Person.Builder().setName(knrVar.a);
        IconCompat iconCompat = knrVar.b;
        icon = name.setIcon(iconCompat != null ? iconCompat.c() : null);
        uri = icon.setUri(knrVar.c);
        key = uri.setKey(knrVar.d);
        bot = key.setBot(knrVar.e);
        important = bot.setImportant(knrVar.f);
        build = important.build();
        return build;
    }

    static knr b(Person person) {
        CharSequence name;
        Icon icon;
        IconCompat iconCompat;
        String uri;
        String key;
        boolean isBot;
        boolean isImportant;
        Icon icon2;
        knq knqVar = new knq();
        name = person.getName();
        knqVar.a = name;
        icon = person.getIcon();
        if (icon != null) {
            icon2 = person.getIcon();
            iconCompat = kqk.e(icon2);
        } else {
            iconCompat = null;
        }
        knqVar.b = iconCompat;
        uri = person.getUri();
        knqVar.c = uri;
        key = person.getKey();
        knqVar.d = key;
        isBot = person.isBot();
        knqVar.e = isBot;
        isImportant = person.isImportant();
        knqVar.f = isImportant;
        return new knr(knqVar);
    }
}
