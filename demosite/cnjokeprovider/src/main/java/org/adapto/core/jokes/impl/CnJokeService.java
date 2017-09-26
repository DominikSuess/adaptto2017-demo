/*
 *  Copyright 2015 Adobe Systems Incorporated
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.adapto.core.jokes.impl;

import org.adapto.core.jokes.JokeService;
import org.osgi.service.component.annotations.Component;

import java.util.Random;

@Component(service = JokeService.class)
public class CnJokeService implements JokeService {

    private final String[] jokes = new String[]{"Superman can stop a bullet with his teeth. Chuck Norris can cause a bullet to implode, before exiting the chamber.",
    "The idea for steel toe boots came from Chuck Norris bare feet",
    "Chuck Norris once mowed his lawn... With a Nail clipper",
    "Chuck Norris\u0027 copy of IE6 can render transparent PNGs correctly.",
    "If you killed Chuck Norris, thats not Chuck Norris, hes behind you.",
    "The guy that God prays to goes to Chuck Norris for forgiveness!",
    "When Chuck Norris does push up he doesn\u0027t push himself up, he pushes the world down.",
    "Chuck Norris was out for a hike when he came face to face with a Grizzly Bear. Witnesses say after screaming loudly, the bear ran whimpering into the woods.",
    " Why did the chicken cross the road? To get to Chuck Norris\u0027s side.",
    "Chuck Norris named the Dead Sea. He also swam to the bottom of it.",
    "Chuck Norris threw his first paper aeroplane age 4... It landed yesterday.",
    "Chuck Norris turned my pepsi into coke....I drank it for my own safety.",
    "Staring at Chuck Norris for extended periods of time without proper eye protection will cause blindess, and possibly foot sized brusies on the face."};

    public String getJoke() {
        return jokes[new Random().nextInt(jokes.length - 1)];
    }
}
